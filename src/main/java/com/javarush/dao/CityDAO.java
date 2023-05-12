package com.javarush.dao;

import com.javarush.domain.City;
import org.hibernate.SessionFactory;


public class CityDAO extends ClazzDAO<City>{
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getById(final short id) {
        return getCurrentSession().get(City.class, id);
    }

    public City getCityById(short id) {
        return getCurrentSession().get(City.class, id);
    }
}