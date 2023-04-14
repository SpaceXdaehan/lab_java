package edu.java.contact.controller;

import java.util.List;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
    
    // singleton
    private static ContactDaoImpl instance = null;
    private ContactDaoImpl() {}
    public static ContactDaoImpl getInstance() {
        if (instance == null) {
            instance = new ContactDaoImpl();
        }
        
        return instance;
    }

    @Override
    public List<Contact> read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Contact read(Integer cid) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int create(Contact contact) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(Contact contact) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Integer cid) {
        // TODO Auto-generated method stub
        return 0;
    }

}
