package com.etisalat.subscription.service;

import com.etisalat.subscription.DAO.UserDAO;
import com.etisalat.subscription.model.User;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService implements Service {

    @Autowired
    UserDAO userDAO;

    @Override
    public void create(Object user) {
        userDAO.save((User) user);

        /// TODO fill missed data from USERDTO to User entity.
    }

    @Override
    public void update(Object user) {
        userDAO.save((User) user);
    }

    @Override
    public void delete(long user_id) {
        userDAO.deleteById(user_id);
    }

    @Override
    public User read(long user_id) {
        return userDAO.getById(user_id);
    }
}
