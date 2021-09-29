package com.etisalat.subscription.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class User {
    @Column
    String name, age, address;
    @Column
    City city;

    //// TODO
    UserType type;

    @OneToMany
    @JoinColumn
    Collection<Interest> interests;

    @Column
    @Id
    @GeneratedValue
    Long id;

    public User(String name, String age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Collection<Interest> getInterests() {
        return interests;
    }

    public void setInterests(Collection<Interest> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", city=" + city +
                ", type=" + type +
                ", interests=" + interests +
                ", id=" + id +
                '}';
    }
}
