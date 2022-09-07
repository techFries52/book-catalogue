package com.controllers;

import com.models.Book;
import com.services.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController @RequiredArgsConstructor @Slf4j
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        log.info("saving new book");
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/book/save").toUriString());
        return ResponseEntity.created(uri).body(bookService.saveBook(book));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {return ResponseEntity.ok().body(bookService.getAllBooks());}


}
