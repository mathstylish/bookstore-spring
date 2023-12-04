package br.com.bookstore.controller;

import br.com.bookstore.domain.book.Book;
import br.com.bookstore.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/api/v1/books", "/api/v1/books/"})
public final class BookController {
    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAll() {
        var books = bookService.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<Book> getById(@PathVariable String isbn){
        var book = bookService.findById(isbn);
        return ResponseEntity.ok(book);
    }
}
