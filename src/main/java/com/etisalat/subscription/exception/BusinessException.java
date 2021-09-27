package com.etisalat.subscription.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class BusinessException extends Exception implements Serializable {
    int action_id;
    int result;
    String reason;
    String defaultBusinessMessage;

    public String getDefaultBusinessMessage() {
        return defaultBusinessMessage;
    }

    public void setDefaultBusinessMessage(String defaultBusinessMessage) {
        this.defaultBusinessMessage = defaultBusinessMessage;
    }

    public BusinessException(String message, int action_id) {
        super(message);
        this.action_id = action_id;
    }

    public BusinessException(int action_id, int result, String reason) {
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
