package br.com.bookstore.repository.book;

import br.com.bookstore.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
