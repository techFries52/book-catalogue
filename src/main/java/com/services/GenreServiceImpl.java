package com.services;

import com.models.Genre;
import com.repos.GenreRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor @Slf4j
public class GenreServiceImpl implements GenreService{

    private final GenreRepo genreRepo;
    @Override
    public Genre saveGenre(Genre genre) {
        log.info("saving new Genre service layer");
        return genreRepo.save(genre);
    }
}
