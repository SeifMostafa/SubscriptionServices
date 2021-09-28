package com.etisalat.subscription.DTO;


import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

@Validated
@RequiredTypes({"command_text","service_name"})
public class Request implements Serializable {




    String command_text, service_name,channel;


    String command_id, service_id;
    int short_code;

    public String getCommand_id() {
        return command_id;
    }

    public void setCommand_id(String command_id) {
        this.command_id = command_id;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getCommand_text() {
        return command_text;
    }


    public void setCommand_text(String command_text) {
        this.command_text = command_text;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getShort_code() {
        return short_code;
    }

    public void setShort_code(int short_code) {
        this.short_code = short_code;
    }

    public String[] getService_parameters() {
        return service_parameters;
    }

    public void setService_parameters(String[] service_parameters) {
        this.service_parameters = service_parameters;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String[]service_parameters;



}
