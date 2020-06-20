package com.prasadct.controllerAdvice.controllerAdvice.controller;

import com.prasadct.controllerAdvice.controllerAdvice.exceptions.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping(value = "/customer")
    public ResponseEntity getCustomer(@RequestParam(name = "name") String name) throws CustomerNotFoundException {
        if (name.equals("Invalid")){//Just for testing
            throw new CustomerNotFoundException("Invalid Customer: " + name);
        }
        return new ResponseEntity("Customer Request Success", HttpStatus.OK);
    }
}
