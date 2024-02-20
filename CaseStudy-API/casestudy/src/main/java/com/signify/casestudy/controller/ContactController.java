package com.signify.casestudy.controller;

import com.signify.casestudy.entity.Contact;
import com.signify.casestudy.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;
    @PostMapping("/api/v1/users")
    public Contact addContact(@RequestBody Contact contact){
        return contactService.addContact(contact);
    }
    @GetMapping("/api/v1/users/{id}")
    public Contact getContactById(@PathVariable("id") Integer userId){
        return contactService.getContactById(userId);
    }
    @PutMapping("/api/v1/users/{id}")
    public Contact updateContact(@PathVariable("id") Integer userId,@RequestBody Contact contact){
        return contactService.updateContact(userId,contact);
    }

    @DeleteMapping("/api/v1/users/{id}")
    public String deleteContact(@PathVariable("id") Integer userId){
        contactService.deleteContactById(userId);
        return "Contact Removed!!";
    }
}
