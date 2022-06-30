package com.testproj.contacts.repositories;

import com.testproj.contacts.entities.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long>{
    public List<Contact> findAllByOrderByLastnameAsc();
    public List<Contact> findAllByOrderByLastnameDesc();
}
