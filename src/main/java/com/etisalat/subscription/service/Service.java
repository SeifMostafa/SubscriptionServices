package com.etisalat.subscription.service;

public interface Service {
    public void create(Object obj);
    public void  update(Object obj);
    public void delete(long id);
    public Object read(long id);

}
