package org.bookstore.reactivebookstore.book.dto;

public record UpdateBookRequest (String title, String author, String isbn, int quantity) {
}
