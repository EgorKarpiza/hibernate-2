package com.javarush.dao;

import com.javarush.domain.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class RentalDAO extends ClazzDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getFirstAvaliableRental (){
        String hql ="from Rental r where r.inventory is null or r.returnDate is not null";
        Query<Rental> query = getCurrentSession().createQuery(hql, Rental.class);
        query.setMaxResults(1);
        Rental rental = query.list().get(0);
        return rental;
    }
}