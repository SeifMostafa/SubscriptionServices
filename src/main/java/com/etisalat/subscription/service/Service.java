package com.etisalat.subscription.service;

public interface Service {
    void create(Object obj);

    void update(Object obj);

    void delete(long id);

    Object read(long id);

}
