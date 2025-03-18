package com.example.AddressBook.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
public class AddressBookDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Address cannot be empty")
    private String address;

    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String phoneNumber;

    @Pattern(regexp = "^[a-zA-Z0-9_+-]+@[a-z]+\\.[a-zA-Z0-9.-]{2,}$")
    @Email(message = "Invalid email format")
    private String email;

    // Default constructor
    public AddressBookDTO() {}

    // Parameterized constructor
    public AddressBookDTO(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Address
    public String getAddress() {
        return address;
    }

    // Getter for Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // toString Method
    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
