package com.controllers;

import com.models.Book;
import com.services.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.websocket.server.PathParam;
import java.net.URI;
import java.util.List;

@RestController @Slf4j
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    private final BookService bookService;

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        log.info("saving new book");
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/book/save").toUriString());
        return ResponseEntity.created(uri).body(bookService.saveBook(book));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {return ResponseEntity.ok().body(bookService.getAllBooks());}

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") Long id){
        Book book = bookService.getBookById(id);
        bookService.deleteBook(book);
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") Long id){
        Book book = bookService.getBookById(id);
        return new ResponseEntity<Book>(bookService.updateBook(book), HttpStatus.ACCEPTED);
    }

}
