package org.bookstore.bookstore_inventory;

import com.google.protobuf.Empty;
import io.grpc.internal.testing.StreamRecorder;
import org.bookstore.bookstore_inventory.book.BookRepository;
import org.bookstore.bookstore_inventory.book.BookServiceImpl;
import org.bookstore.bookstore_inventory.proto.AddBookRequest;
import org.bookstore.bookstore_inventory.proto.DeleteBookRequest;
import org.citrusframework.GherkinTestActionRunner;
import org.citrusframework.annotations.CitrusResource;
import org.citrusframework.annotations.CitrusTest;
import org.citrusframework.junit.jupiter.CitrusSupport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.apache.commons.dbcp2.BasicDataSource;

import static org.citrusframework.actions.ExecuteSQLAction.Builder.sql;
import static org.citrusframework.actions.ExecuteSQLQueryAction.Builder.query;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {"spring.jpa.hibernate.ddl-auto=update", "grpc.server.port=9091"})
@Testcontainers
@CitrusSupport
public class BookServiceGrpcTest extends BaseIntegrationTest {
    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    private static final DeleteBookRequest DELETE_BOOK_REQUEST = DeleteBookRequest
            .newBuilder()
            .setId(1)
            .build();

    private static final AddBookRequest ADD_BOOK_REQUEST = AddBookRequest
            .newBuilder()
            .setAuthor("Author")
            .setTitle("Title")
            .setIsbn("ISBN")
            .setQuantity(1)
            .build();

    private BookServiceImpl underTest;
    @Autowired
    private BookRepository bookRepository;

    @BeforeEach
    public void setup() {
        underTest = new BookServiceImpl(bookRepository);
        bookRepository.deleteAll();
    }

    @Test
    @CitrusTest
    public void testDeleteBook(@CitrusResource GherkinTestActionRunner runner) {
        runner.$(sql().dataSource(dataSource())
                .statement("insert into book (id, title, author, isbn, quantity) " +
                        "values (1, 'Title', 'Author', 'ISBN', 1)"));
        StreamRecorder<Empty> observer = StreamRecorder.create();
        underTest.deleteBook(DELETE_BOOK_REQUEST, observer);

        List<Empty> results = observer.getValues();
        assertEquals(1, results.size());
        assertEquals(Empty.newBuilder().build(), results.getFirst());
        runner.$(query(dataSource())
                .statement("select count(*) from book where title = 'Title'" +
                        " and author = 'Author' and isbn = 'ISBN' and quantity = 1")
                .validate("count", String.valueOf(0)));
    }

    @Test
    @CitrusTest
    public void testAddBook(@CitrusResource GherkinTestActionRunner runner) {
        StreamRecorder<Empty> observer = StreamRecorder.create();
        underTest.addBook(ADD_BOOK_REQUEST, observer);

        List<Empty> results = observer.getValues();
        assertEquals(1, results.size());
        assertEquals(Empty.newBuilder().build(), results.getFirst());
        runner.$(query(dataSource())
                .statement("select * from book where title = 'Title' " +
                        "and author = 'Author' and isbn = 'ISBN' and quantity = 1")
                .validate("title", "Title"));
    }

    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(datasourceUrl);
        dataSource.setUsername("test");
        dataSource.setPassword("test");
        return dataSource;
    }
}
