package com.example.controllers;

import com.example.NotEnoughMoneyException;
import com.example.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughtMoneyHandler(){
        ErrorDetails errorDetails= new ErrorDetails();
        errorDetails.setMessage("Not enought money to make the payment.");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
