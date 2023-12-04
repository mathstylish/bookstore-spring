package br.com.bookstore.exception.book;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookIdNotFoundException extends RuntimeException {
    public BookIdNotFoundException(String message) {
        super(message);
    }
}
