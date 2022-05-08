package com.contacts.mylist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contacts.mylist.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
