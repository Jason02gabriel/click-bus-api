package com.biel.clickbus.exception;

import com.biel.clickbus.dtos.ExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity findIdException(NoSuchElementException e) {
        ExceptionDTO exceptionDTO = new ExceptionDTO("Id not found", "400");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity findNameException(NoResourceFoundException e) {

        ExceptionDTO exceptionDTO = new ExceptionDTO("\"No places found with the name \"+name+\"!\"", "400");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity findStateException(NotFoundException e) {

        ExceptionDTO exceptionDTO = new ExceptionDTO("Enter a valid state", "400");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }

    @ExceptionHandler(CItyNotFoundException.class)
    public ResponseEntity findCityException(CItyNotFoundException e) {

        ExceptionDTO exceptionDTO = new ExceptionDTO("Enter a valid city", "400");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }











}
