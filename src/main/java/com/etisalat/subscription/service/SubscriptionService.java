package com.etisalat.subscription.service;

import com.etisalat.subscription.DAO.SubscriptionServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    SubscriptionServiceDAO subscriptionServiceDAO;

    public List<com.etisalat.subscription.model.SubscriptionService> getAllowedServices(long serviceClassId){
        subscriptionServiceDAO = SubscriptionServiceDAO.getInstance();
        return subscriptionServiceDAO.getAllowedServices(serviceClassId);
    }

}
