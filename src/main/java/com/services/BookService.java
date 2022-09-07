package com.services;

import com.models.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    void addGenreToBook(String genreName, String bookTitle);
    Book getBook(String title);
    List<Book> getAllBooks();
}
