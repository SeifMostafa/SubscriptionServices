package com.etisalat.subscription.service;

import com.etisalat.subscription.DAO.SubscriptionServiceDAO;
import com.etisalat.subscription.exception.BusinessException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    SubscriptionServiceDAO subscriptionServiceDAO;

    public List<com.etisalat.subscription.model.SubscriptionService> getAllowedServices(long serviceClassId) throws BusinessException {
        if(serviceClassId==2095){
            BusinessException businessException = new BusinessException(1,-1,"service is for internal use only!");
            businessException.setDefaultBusinessMessage("Sorry you can't use this service now!");
            throw businessException;
        }
        subscriptionServiceDAO = SubscriptionServiceDAO.getInstance();
        return subscriptionServiceDAO.getAllowedServices(serviceClassId);
    }

}
