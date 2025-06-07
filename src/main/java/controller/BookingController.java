package com.example.bookingsystem.controller;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/bookings")
public class BookingController{
    @autowire
    BookingService bookingService;

    BookingController(){

    }

    @PostMapping("/")
    private  saveBooking(@RequestBody Booking booking){
        Customer cust=new Customer("GG");
        return bookingService.addCust(cust);
    }
}
