package com.example.AddressBook.repository;

import com.example.AddressBook.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Integer> {
}