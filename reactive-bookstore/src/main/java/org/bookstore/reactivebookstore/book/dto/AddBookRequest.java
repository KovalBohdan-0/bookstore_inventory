package org.bookstore.reactivebookstore.book.dto;

public record AddBookRequest(String title, String author, String isbn, int quantity) {
}
