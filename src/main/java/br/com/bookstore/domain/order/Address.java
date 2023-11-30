package br.com.bookstore.domain.order;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.pl.NIP;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Embeddable
public class Address {
    @Column(length = 6)
    private String postalCode;
    @Column(length = 100)
    private String street;
    @Column(name = "building_no", length = 5)
    private String buildingNumber;
    @Column(name = "flat_no",length = 5)
    private String flatNumber;
    @Column(length = 100)
    private String city;
    @NIP
    private String nip;
    @Column(length = 9)
    private String phoneNumber;
}