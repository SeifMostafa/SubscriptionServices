package com.etisalat.subscription.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class SystemException extends Exception implements Serializable {
    int action_id;
    int result;
    String reason;
    String substituteMessage;

    public String getSubstituteMessage() {
        return substituteMessage;
    }

    public void setSubstituteMessage(String substituteMessage) {
        this.substituteMessage = substituteMessage;
    }

    public SystemException(String message, int action_id) {
        super(message);
        this.action_id = action_id;
    }

    public SystemException(int action_id, int result, String reason) {
        this.action_id = action_id;
        this.result = result;
        this.reason = reason;
    }

    public int getAction_id() {
        return action_id;
    }

    public void setAction_id(int action_id) {
        this.action_id = action_id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
