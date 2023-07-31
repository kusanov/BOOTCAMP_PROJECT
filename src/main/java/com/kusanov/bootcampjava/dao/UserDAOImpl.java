package com.kusanov.bootcampjava.dao;

import com.kusanov.bootcampjava.entity.User;
import jakarta.persistence.EntityManager;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    private static Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

    @Autowired
private EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("from User order by email", User.class);
        List<User> allUsers = query.getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        Session session= entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public User getUser(int id) {
        Session session= entityManager.unwrap(Session.class);
        User user = session.get(User.class,id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        Session session= entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("delete from User " + " where id =:userid");
        query.setParameter("userid",id);
        query.executeUpdate();
    }
}
