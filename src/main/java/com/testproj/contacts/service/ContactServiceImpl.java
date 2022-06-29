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
    public Contact UpdateContact(Contact contact,Long Id){

        Contact DBContact = contactrepo.findById(Id).get();
        String given_fname = contact.getFirst_name();
        String given_lname = contact.getLast_name();
        String given_bphone = contact.getBusiness_phone();
        String given_pphone = contact.getPersonal_phone();
        String given_mphone = contact.getMobile_phone();
        String given_mail = contact.getPersonal_email();

        if(!given_fname.equals("")){
            DBContact.setFirst_name(given_fname);
        }

        if(!given_lname.equals("")){
            DBContact.setLast_name(given_lname);
        }

        if(!given_bphone.equals("")){
            DBContact.setBusiness_phone(given_bphone);
        }

        if(!given_pphone.equals("")){
            DBContact.setPersonal_phone(given_pphone);
        }

        if(!given_mphone.equals("")){
            DBContact.setMobile_phone(given_mphone);
        }

        if(!given_mail.equals("")){
            DBContact.setPersonal_email(given_mail);
        }

        return contactrepo.save(DBContact);

    }

    @Override
    public List<Contact> FetchContacts(){
        return (List<Contact>) contactrepo.findAll();

    }
}
