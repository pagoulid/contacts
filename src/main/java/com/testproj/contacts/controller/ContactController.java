package com.testproj.contacts.controller;

import com.testproj.contacts.entities.Contact;
import com.testproj.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactservice;

    @PostMapping("/app/contacts")
    public Contact AddContact(@Valid @RequestBody Contact contact){
        return contactservice.AddContact(contact);
    }
    @PutMapping("/app/contacts/{id}")
    public Contact UpdateContact(@Valid @RequestBody Contact contact,@PathVariable("id") Long Id){
        return contactservice.UpdateContact(contact,Id);
    }
    @DeleteMapping("/app/contacts/{id}")
    public void DeleteContact(@PathVariable("id") Long Id){
        contactservice.DeleteContact(Id);
    }
    @GetMapping("/app/contacts")
    public List<Contact> FetchContacts(){
        return contactservice.FetchContacts();
    }
}
