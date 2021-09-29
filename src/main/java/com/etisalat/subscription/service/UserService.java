package com.etisalat.subscription.service;

import com.etisalat.subscription.DAO.UserDAO;
import com.etisalat.subscription.DTO.UserDTO;
import com.etisalat.subscription.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService implements Service {
    public static final String COL_NAME = "users";
    public final static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDAO userDAO;

    @Override
    public void create(Object user) {
    //    userDAO.save((UserDTO) user);



        try {

            final FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference ref = database.getReference("users");
            DatabaseReference userRef = ref.push();
            userRef.setValueAsync(user);
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
        }

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
