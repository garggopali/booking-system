package com.gopali.bookingsystem.controller;

//import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @autowire
    CustomerService CustomerService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody Customer customer){

    }
    
}
