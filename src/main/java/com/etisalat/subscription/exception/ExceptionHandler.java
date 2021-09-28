package com.etisalat.subscription.exception;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class)
    public final ResponseEntity<BusinessException> handleBusinessException(BusinessException businessException, WebRequest webRequest){
        LOGGER.info("handleBusinessException: "+ webRequest.toString());
        LOGGER.info("handleBusinessException: "+businessException.getMessage());
    return  new ResponseEntity<>(new BusinessException(businessException.action_id, businessException.result, businessException.reason), HttpStatus.NOT_ACCEPTABLE);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        SystemException systemException = new SystemException(1,-1,ex.getBindingResult().toString());
        systemException.setSubstituteMessage("Sorry, Subscription can't fulfill your request!");

        return new ResponseEntity<>(systemException,HttpStatus.NOT_ACCEPTABLE);
    }
}
