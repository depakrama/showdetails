package com.showdetails.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

   @Override
   
   protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
       String error = "Could not decode request: JSON parsing failed";
    
       Error apiError = new Error(error);
       return new ResponseEntity<Object>(
         apiError,  HttpStatus.BAD_REQUEST);
   }
   
}
