package org.bookstore.bookstore_inventory;

import io.grpc.stub.StreamObserver;
import org.bookstore.bookstore_inventory.book.Book;
import org.bookstore.bookstore_inventory.book.BookRepository;
import org.bookstore.bookstore_inventory.book.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @Mock
    private StreamObserver<org.bookstore.bookstore_inventory.proto.Book> responseObserver;

    @Mock
    private StreamObserver<com.google.protobuf.Empty> emptyResponseObserver;

    @InjectMocks
    private BookServiceImpl bookService;

    @Test
    public void testGetBook() {
        Book book = new Book();
        book.setId(1L);
        book.setTitle("Test Book");
        book.setAuthor("Test Author");
        book.setIsbn("1234567890");
        book.setQuantity(10);

        when(bookRepository.findById(any(Long.class))).thenReturn(java.util.Optional.of(book));

        org.bookstore.bookstore_inventory.proto.GetBookRequest request = org.bookstore.bookstore_inventory.proto
                .GetBookRequest.newBuilder()
                .setId(1L)
                .build();

        bookService.getBook(request, responseObserver);

        verify(responseObserver).onNext(any(org.bookstore.bookstore_inventory.proto.Book.class));
        verify(responseObserver).onCompleted();
    }

    @Test
    public void testGetBookNotFound() {
        when(bookRepository.findById(any(Long.class))).thenReturn(java.util.Optional.empty());

        org.bookstore.bookstore_inventory.proto.GetBookRequest request = org.bookstore.bookstore_inventory.proto
                .GetBookRequest.newBuilder()
                .setId(1L)
                .build();

        bookService.getBook(request, responseObserver);

        verify(responseObserver).onError(any(Throwable.class));
    }

    @Test
    public void testAddBook() {
        org.bookstore.bookstore_inventory.proto.AddBookRequest request = org.bookstore.bookstore_inventory.proto
                .AddBookRequest.newBuilder()
                .setTitle("Test Book")
                .setAuthor("Test Author")
                .setIsbn("1234567890")
                .setQuantity(10)
                .build();

        bookService.addBook(request, emptyResponseObserver);

        verify(bookRepository).save(any(Book.class));
        verify(emptyResponseObserver).onNext(any());
        verify(emptyResponseObserver).onCompleted();
    }

    @Test
    public void testUpdateBook() {
        Book book = new Book();
        book.setId(1L);
        book.setTitle("Test Book");
        book.setAuthor("Test Author");
        book.setIsbn("1234567890");
        book.setQuantity(10);

        when(bookRepository.findById(any(Long.class))).thenReturn(java.util.Optional.of(book));

        org.bookstore.bookstore_inventory.proto.UpdateBookRequest request = org.bookstore.bookstore_inventory.proto
                .UpdateBookRequest.newBuilder()
                .setId(1L)
                .setTitle("Updated Test Book")
                .setAuthor("Updated Test Author")
                .setIsbn("0987654321")
                .setQuantity(20)
                .build();

        bookService.updateBook(request, emptyResponseObserver);

        verify(bookRepository).save(any(Book.class));
        verify(emptyResponseObserver).onNext(any());
        verify(emptyResponseObserver).onCompleted();
    }

    @Test
    public void testDeleteBook() {
        org.bookstore.bookstore_inventory.proto.DeleteBookRequest request = org.bookstore.bookstore_inventory.proto
                .DeleteBookRequest.newBuilder()
                .setId(1L)
                .build();

        bookService.deleteBook(request, emptyResponseObserver);

        verify(bookRepository).deleteById(any(Long.class));
        verify(emptyResponseObserver).onNext(any());
        verify(emptyResponseObserver).onCompleted();
    }
}
