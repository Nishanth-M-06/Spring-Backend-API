package com.signify.casestudy.services;

import com.signify.casestudy.entity.Contact;

public interface ContactService {
    Contact addContact(Contact contact);

    Contact getContactById(Integer userId);

    Contact updateContact(Integer userId, Contact contact);

    void deleteContactById(Integer userId);
}
