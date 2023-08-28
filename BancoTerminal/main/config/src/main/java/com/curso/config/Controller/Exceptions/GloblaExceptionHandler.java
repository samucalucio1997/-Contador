package com.curso.config.Controller.Exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloblaExceptionHandler {
    
    @ExceptionHandler(IllegalArgumentException.class)  
    public ResponseEntity<String> handle(IllegalArgumentException busineesException){
        return new ResponseEntity<>(busineesException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
    
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handle(NoSuchMethodException NoSuchElementException){
       return new ResponseEntity<>("Resource not found", HttpStatus.NOT_FOUND);
    }
     
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleUnexpected(Exception anyexception){
        
        return new ResponseEntity<>("Resource lost server",HttpStatus.NOT_FOUND);
    }
}
