package com.example.AddressBook;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT")
public class Address {
    @Id
    @Column(name="NAME")
    private String name;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="PHONE-NUMBER")
    private String phoneNumber;
    @Column(name="EMAIL")
    private String email;
}
