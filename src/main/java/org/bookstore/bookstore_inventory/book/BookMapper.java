package org.bookstore.bookstore_inventory.book;

import org.bookstore.bookstore_inventory.proto.AddBookRequest;
import org.bookstore.bookstore_inventory.proto.UpdateBookRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        implementationPackage = "<PACKAGE_NAME>.impl")
public interface BookMapper {
    @Mapping(target = "id", ignore = true)
    Book toBook(AddBookRequest addBookRequest);

    Book toBook(UpdateBookRequest updateBookRequest);

    org.bookstore.bookstore_inventory.proto.Book toProtoBook(Book book);
}
