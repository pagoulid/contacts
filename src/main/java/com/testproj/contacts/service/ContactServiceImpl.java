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
        String given_fname = contact.getFirstname();
        String given_lname = contact.getLastname();
        String given_bphone = contact.getBusinessphone();
        String given_pphone = contact.getPersonalphone();
        String given_mphone = contact.getMobilephone();
        String given_mail = contact.getPersonalemail();

        if(!given_fname.equals("")){
            DBContact.setFirstname(given_fname);
        }

        if(!given_lname.equals("")){
            DBContact.setLastname(given_lname);
        }

        if(!given_bphone.equals("")){
            DBContact.setBusinessphone(given_bphone);
        }

        if(!given_pphone.equals("")){
            DBContact.setPersonalphone(given_pphone);
        }

        if(!given_mphone.equals("")){
            DBContact.setMobilephone(given_mphone);
        }

        if(!given_mail.equals("")){
            DBContact.setPersonalemail(given_mail);
        }

        return contactrepo.save(DBContact);

    }
    @Override
    public void DeleteContact(Long Id){
        Contact DBContact = contactrepo.findById(Id).get();
        contactrepo.delete(DBContact);

    }

    @Override
    public List<Contact> FetchContacts(){
        return (List<Contact>) contactrepo.findAll();

    }

    public  List<Contact> FetchContactsSortedByLastName(String order){
        if(order.equals("Asc")){
           return contactrepo.findAllByOrderByLastnameAsc();
        }
        else if(order.equals("Desc")){
            return contactrepo.findAllByOrderByLastnameDesc();
        }
        return (List<Contact>) contactrepo.findAll();
    }
}
