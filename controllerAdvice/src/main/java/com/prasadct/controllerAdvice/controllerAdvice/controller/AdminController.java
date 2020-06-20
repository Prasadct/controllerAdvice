package com.prasadct.controllerAdvice.controllerAdvice.controller;

import com.prasadct.controllerAdvice.controllerAdvice.exceptions.AdminException;
import com.prasadct.controllerAdvice.controllerAdvice.exceptions.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping(value = "/admin")
    public ResponseEntity getCustomer(@RequestParam(name = "admin") String admin) throws AdminException {
        if (admin.equals("Invalid")){//Just for testing
            throw new AdminException("Invalid Admin: " + admin);
        }
        return new ResponseEntity("Admin Request Success", HttpStatus.OK);
    }
}
