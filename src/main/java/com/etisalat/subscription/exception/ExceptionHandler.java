package com.etisalat.subscription.exception;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

}
