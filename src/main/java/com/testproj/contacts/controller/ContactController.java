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

    @PostMapping("/https/contacts")
    public Contact AddContact(@Valid @RequestBody Contact contact){
        return contactservice.AddContact(contact);
    }

    @GetMapping("/https/contacts")
    public List<Contact> FetchContacts(){
        return contactservice.FetchContacts();
    }
}
