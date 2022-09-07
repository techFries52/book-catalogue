package com.services;

import com.models.Book;
import com.models.Genre;
import com.repos.BookRepo;
import com.repos.GenreRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Slf4j @RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;
    private final GenreRepo genreRepo;
    @Override
    public Book saveBook(Book book) {
        log.info("New Book: {} saved to db", book.getTitle());
         return bookRepo.save(book);
    }

    @Override
    public void addGenreToBook(String genreName, String bookTitle) {
        log.info("adding genre {} to book {}", genreName, bookTitle);
        Book book = bookRepo.findByTitle(bookTitle);
        Genre genre = genreRepo.findByName(genreName);
        book.getGenres().add(genre);
        bookRepo.save(book);
    }

    @Override
    public Book getBook(String title) {
        log.info("fetching book: {} by title", title);
        return bookRepo.findByTitle(title);
    }

    @Override
    public List<Book> getAllBooks() {
        log.info("fetching all books");
        return bookRepo.findAll();
    }
}
