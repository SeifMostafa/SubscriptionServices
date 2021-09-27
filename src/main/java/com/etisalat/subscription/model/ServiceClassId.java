package com.etisalat.subscription.model;

import javax.persistence.Id;

public class ServiceClassId {
    @Id
    long service_class_id;

    String service_class_name, service_class_description;

}
