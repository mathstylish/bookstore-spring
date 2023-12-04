package br.com.bookstore.service.book;

import br.com.bookstore.domain.book.Book;
import br.com.bookstore.exception.book.BookIdNotFoundException;
import br.com.bookstore.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(String isbn) {
        return bookRepository.findById(isbn)
                .orElseThrow(() -> new BookIdNotFoundException("Book Isbn not found"));
    }
}