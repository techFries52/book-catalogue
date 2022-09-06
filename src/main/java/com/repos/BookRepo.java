package com.repos;

import com.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    Book findByTitle(String title);
    Book findByAuthor(String author);
}
