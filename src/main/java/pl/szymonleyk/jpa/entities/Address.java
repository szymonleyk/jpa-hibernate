package pl.szymonleyk.jpa.entities;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;

    @Column(name = "house_nr")
    private String houseNr;

    @Column(name = "flat_nr")
    private int flatNr;

    @Column(name = "zip_code")
    private String zipCode;

    private String city;

    public Address(){}

    public Address(String street, String houseNr, int flatNr, String zipCode, String city) {
        this.street = street;
        this.houseNr = houseNr;
        this.flatNr = flatNr;
        this.zipCode = zipCode;
        this.city = city;
    }
}
