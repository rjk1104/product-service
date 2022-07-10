package org.paatra.services.product.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> invalidArgument(MethodArgumentNotValidException ex){

        Map<String,String> map =new HashMap<String,String>();
        ex.getBindingResult().getFieldErrors().forEach(objectError ->
                map.put(objectError.getField(),objectError.getDefaultMessage()));
        return map;


    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFoundException.class)
    public String productNotFoundException(ProductNotFoundException ex){

        return ex.getMessage();


    }


}
