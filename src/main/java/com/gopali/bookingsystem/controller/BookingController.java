package com.gopali.bookingsystem.controller;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/bookings")
public class BookingController{
    @autowire
    BookingService bookingService;

    BookingController(){

    }

    @PostMapping("/")
    private ResponseEntity saveBooking(@RequestBody Booking booking){
        return null;
    }


}
