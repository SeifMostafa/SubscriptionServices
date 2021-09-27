package com.etisalat.subscription.DAO;


import com.etisalat.subscription.model.SubscriptionService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SubscriptionServiceDAO {
    public static SubscriptionServiceDAO instance;
//    private SubscriptionServiceDAO(){
//
//    }
    public static SubscriptionServiceDAO getInstance(){
        if(instance==null){
            instance = new SubscriptionServiceDAO();
        }
        return instance;
    }

    public SubscriptionServiceDAO(){

    }

    public List<SubscriptionService> getAllowedServices(long serviceClassId){
        List<SubscriptionService> result = new ArrayList<>();
        result.add(new SubscriptionService(1811,"TESLA"));
        result.add(new SubscriptionService(270,"4G_OFFER"));
        result.add(new SubscriptionService(2095,"SUBSCRIPTION_CONFIRMATION"));
        result.add(new SubscriptionService(serviceClassId,"null"));
        return result;
    }

}
