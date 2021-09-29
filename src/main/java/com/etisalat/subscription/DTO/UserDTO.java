package com.etisalat.subscription.DTO;

import com.etisalat.subscription.model.City;
import com.etisalat.subscription.model.Interest;

import java.util.Arrays;

public class UserDTO {
    String age, address,name;
    City city;
    Interest[] interests;


    public UserDTO(String name,String age, String address, City city, Interest[] interests) {
        this.name= name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.interests = interests;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Interest[] getInterests() {
        return interests;
    }

    public void setInterests(Interest[] interests) {
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='"+name +'\''+
                "age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", city=" + city +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}
