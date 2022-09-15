package com.controllers;

import com.models.Genre;
import com.services.BookService;
import com.services.GenreService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController @Slf4j
@RequestMapping("/genre")
public class GenreController {

    public GenreController(GenreService genreService, BookService bookService) {
        this.genreService = genreService;
        this.bookService = bookService;
    }

    private final GenreService genreService;
    private final BookService bookService;

    @PostMapping("/save")
    public ResponseEntity<Genre> saveGenre(@RequestBody Genre genre){
        log.info("saving new Genre");
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/genre/save").toUriString());
        return ResponseEntity.created(uri).body(genreService.saveGenre(genre));
    }

    @PostMapping
    public ResponseEntity<?> addGenreToBook(@RequestBody GenreToBookForm form){
        bookService.addGenreToBook(form.getGenreName(), form.getBookTitle());
        return ResponseEntity.ok().build();
    }


}

@Data
class GenreToBookForm {
    private String bookTitle;
    private String genreName;
}
