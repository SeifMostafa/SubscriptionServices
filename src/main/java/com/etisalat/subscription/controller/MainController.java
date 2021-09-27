package com.etisalat.subscription.controller;

import com.etisalat.subscription.exception.BusinessException;
import com.etisalat.subscription.model.ServiceClassId;
import com.etisalat.subscription.model.SubscriptionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    com.etisalat.subscription.service.SubscriptionService subscriptionService;

    @RequestMapping(method = RequestMethod.GET, value = "/getAllowedServices")
    public List<SubscriptionService> getAllowedServices(@RequestParam(name = "serviceClassId", required = true) long serviceClassId) throws BusinessException {
        // repo
        subscriptionService= new com.etisalat.subscription.service.SubscriptionService();
       try{
           return subscriptionService.getAllowedServices(serviceClassId);
       }catch(BusinessException businessException){
           throw businessException;
       }
    }


    @RequestMapping(method = RequestMethod.GET, value = "/getService/{service}")
    public SubscriptionService getService(@PathVariable(name = "service", required = true) String service) throws JsonProcessingException {
        // object mapper
        ObjectMapper objectMapper = new ObjectMapper();
        SubscriptionService subscriptionService ;
        subscriptionService = objectMapper.readValue(service,SubscriptionService.class);
        subscriptionService.setId(subscriptionService.getId()+1);
        subscriptionService.setDescription("passed service with id+1");
        return subscriptionService;
    }
}
