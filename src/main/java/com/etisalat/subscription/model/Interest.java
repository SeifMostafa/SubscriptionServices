package com.etisalat.subscription.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Interest {
    @Column
    String name;
    @Column
    @Id
    String tag;

    public Interest(String name) {
        this.name = name;
    }
    public Interest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
