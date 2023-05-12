package com.javarush.dao;

import com.javarush.domain.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class CustomerDAO extends ClazzDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }

    public Customer getById(short id){
        String hql ="from Customer c where c.id =:id";
        Query<Customer> query = getCurrentSession().createQuery(hql, Customer.class);
        query.setParameter("id", id);
        return query.uniqueResult();
    }
}