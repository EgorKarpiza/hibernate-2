package com.javarush.dao;

import com.javarush.domain.Address;
import org.hibernate.SessionFactory;


public class AddressDAO extends ClazzDAO<Address> {
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}