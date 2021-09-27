package com.etisalat.subscription.controller;

import com.etisalat.subscription.model.ServiceClassId;
import com.etisalat.subscription.model.SubscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping(method = RequestMethod.GET, value = "/getAllowedServices")
    public List<SubscriptionService> getAllowedServices(@RequestParam(name = "serviceClassId", required = true) long serviceClassId) {
        // database call to get eligible rateplans
        List<SubscriptionService> result = new ArrayList<>();
        result.add(new SubscriptionService(1811,"TESLA"));
        result.add(new SubscriptionService(270,"4G_OFFER"));
        result.add(new SubscriptionService(2095,"SUBSCRIPTION_CONFIRMATION"));
        result.add(new SubscriptionService(serviceClassId,"null"));
        return result;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/getService/{service_id}")
    public SubscriptionService getService(@PathVariable(name = "service_id", required = true) long service_id) {
        // database call to get eligible rateplans
        return new SubscriptionService(service_id,"TESLA");
    }
}
