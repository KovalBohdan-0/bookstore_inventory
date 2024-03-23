package org.bookstore.bookstore_inventory.book;

import com.google.protobuf.Empty;
import io.grpc.Status;
import jakarta.transaction.Transactional;
import org.bookstore.bookstore_inventory.proto.AddBookRequest;
import org.bookstore.bookstore_inventory.proto.BookServiceGrpc;
import org.bookstore.bookstore_inventory.proto.UpdateBookRequest;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BookServiceImpl extends BookServiceGrpc.BookServiceImplBase {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    @Transactional
    public void addBook(AddBookRequest request, io.grpc.stub.StreamObserver<org.bookstore.bookstore_inventory
            .proto.Book> responseObserver) {
        Book book = bookMapper.toBook(request);
        book = bookRepository.save(book);
        org.bookstore.bookstore_inventory.proto.Book response = bookMapper.toProtoBook(book);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void updateBook(UpdateBookRequest request, io.grpc.stub.StreamObserver<Empty> responseObserver) {
        try {
            if (!bookRepository.existsById(request.getId())) {
                throw new BookNotFoundException("Book not found");
            }

            Book book = bookMapper.toBook(request);
            bookRepository.save(book);
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (BookNotFoundException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    @Transactional
    public void deleteBook(org.bookstore.bookstore_inventory.proto.DeleteBookRequest request, io.grpc.stub.StreamObserver<Empty> responseObserver) {
        bookRepository.deleteById(request.getId());
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void getBook(org.bookstore.bookstore_inventory.proto.GetBookRequest request,
                        io.grpc.stub.StreamObserver<org.bookstore.bookstore_inventory.proto.Book> responseObserver) {
        try {
            Book book = bookRepository.findById(request.getId())
                    .orElseThrow(() -> new BookNotFoundException("Book not found"));
            org.bookstore.bookstore_inventory.proto.Book response = bookMapper.toProtoBook(book);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (BookNotFoundException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }
}
