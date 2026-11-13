package com.example.sd22332.repository;

import com.example.sd22332.model.Drink;
import com.example.sd22332.util.HibernateConfig;
import jakarta.persistence.Query;
import org.hibernate.Session;

import java.util.List;

public class DrinkRepo {

    public List<Drink> getDrinks() {
        Session session = HibernateConfig.getFACTORY().openSession();
        Query query = session.createQuery("from Drink");
        List<Drink> drinks = query.getResultList();
        return drinks;
    }
}
