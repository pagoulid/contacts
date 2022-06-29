package com.testproj.contacts.service;
import com.testproj.contacts.entities.Contact;
import java.util.List;
public interface ContactService {

    Contact AddContact(Contact contact);
    Contact UpdateContact(Contact contact,Long Id);
    List<Contact> FetchContacts();


}
