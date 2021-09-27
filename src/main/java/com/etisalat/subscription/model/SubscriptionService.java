package com.etisalat.subscription.model;


import javax.persistence.Id;

public class SubscriptionService {
    @Id
    long id;
    String name, description;

    public SubscriptionService(long id) {
        this.id = id;
    }

    public SubscriptionService(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
