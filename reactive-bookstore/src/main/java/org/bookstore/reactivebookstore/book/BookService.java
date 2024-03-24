package org.bookstore.reactivebookstore.book;

import org.bookstore.reactivebookstore.book.dto.AddBookRequest;
import org.bookstore.reactivebookstore.book.dto.UpdateBookRequest;
import org.bookstore.reactivebookstore.exception.BookNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Mono<Book> addBook(AddBookRequest request) {
        Book book = new Book(request.title(), request.author(), request.isbn(), request.quantity());
        return bookRepository.save(book);
    }

    public Mono<Book> updateBook(Long id, UpdateBookRequest book) {
        return bookRepository.findById(id)
                .switchIfEmpty(Mono.error(new BookNotFoundException("Book not found")))
                .map(b -> {
                    b.setTitle(book.title());
                    b.setAuthor(book.author());
                    b.setIsbn(book.isbn());
                    b.setQuantity(book.quantity());
                    return b;
                })
                .flatMap(bookRepository::save);
    }

    public Mono<Void> deleteBook(Long id) {
        return bookRepository.deleteById(id);
    }

    public Mono<Book> getBook(Long id) {
        return bookRepository.findById(id)
                .switchIfEmpty(Mono.error(new BookNotFoundException("Book not found")));
    }

    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
