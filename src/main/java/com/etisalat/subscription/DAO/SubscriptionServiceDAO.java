package com.etisalat.subscription.DAO;


import com.etisalat.subscription.model.SubscriptionService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface SubscriptionServiceDAO extends JpaRepository<SubscriptionService,Long> {
    //public static SubscriptionServiceDAO instance;
//    private SubscriptionServiceDAO(){
//
//    }
//    public static SubscriptionServiceDAO getInstance(){
//        if(instance==null){
//            instance = new SubscriptionServiceDAO();
//        }
//        return instance;
//    }
//
//    public SubscriptionServiceDAO(){
//
//    }

    public default List<SubscriptionService> getAllowedServices(long serviceClassId){
        List<SubscriptionService> result = new ArrayList<>();
        result.add(new SubscriptionService(1811,"TESLA"));
        result.add(new SubscriptionService(270,"4G_OFFER"));
        result.add(new SubscriptionService(2095,"SUBSCRIPTION_CONFIRMATION"));
        result.add(new SubscriptionService(serviceClassId,"null"));
        return result;
    }

    public SubscriptionService findById(long id);
}
