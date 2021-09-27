package com.etisalat.subscription.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubscriptionService {
    @Id
    Long Id;
    String name, description;


    public SubscriptionService() {

    }

    public SubscriptionService(long id) {
        this.Id = id;
    }

    public SubscriptionService(long id, String name) {
        this.Id = id;
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
