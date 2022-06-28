package com.testproj.contacts.service;
import com.testproj.contacts.service.ContactService;
import com.testproj.contacts.entities.Contact;
import com.testproj.contacts.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactrepo;

    @Override
    public Contact AddContact(Contact contact){
        return contactrepo.save(contact);

    }

    @Override
    public List<Contact> FetchContacts(){
        return (List<Contact>) contactrepo.findAll();

    }
}
