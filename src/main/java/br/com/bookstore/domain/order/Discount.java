package br.com.bookstore.domain.order;

import br.com.bookstore.domain.book.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "discounts")
public class Discount {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 100)
    private String name;
    @Column(precision = 6, scale = 2)
    private BigDecimal value;

    @JsonIgnore
    @ManyToMany(mappedBy = "discounts")
    private Set<Customer> customers;

    @JsonIgnore
    @ManyToMany(mappedBy = "discounts")
    private Set<Book> books;
}