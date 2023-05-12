package com.javarush.dao;

import com.javarush.domain.Language;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class LanguageDAO extends ClazzDAO<Language>{
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }

    public Language getById (Byte id){
        String hql ="from Language c where c.id =:id";
        Query<Language> query = getCurrentSession().createQuery(hql, Language.class);
        query.setParameter("id", id);
        return query.uniqueResult();
    }
}