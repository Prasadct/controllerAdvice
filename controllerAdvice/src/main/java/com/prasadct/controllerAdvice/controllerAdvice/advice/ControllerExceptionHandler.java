package com.prasadct.controllerAdvice.controllerAdvice.advice;

import com.prasadct.controllerAdvice.controllerAdvice.controller.AdminController;
import com.prasadct.controllerAdvice.controllerAdvice.controller.CustomerController;
import com.prasadct.controllerAdvice.controllerAdvice.exceptions.CustomerNotFoundException;
import com.prasadct.controllerAdvice.controllerAdvice.exceptions.AdminException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice(basePackageClasses = {AdminController.class, CustomerController.class})
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity customerNotFoundException(Exception ex){
        //Create customer response
        String output = "Customer not found " + new Date() + " " + ex.getMessage();
        return new ResponseEntity(output, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AdminException.class)
    public ResponseEntity invalidNameException(Exception ex){
        //Create customer response
        String output = "Invalid Admin " + new Date() + " " + ex.getMessage();
        return new ResponseEntity(output, HttpStatus.BAD_REQUEST);
    }
}
