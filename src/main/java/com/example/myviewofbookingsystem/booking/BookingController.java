package com.example.myviewofbookingsystem.booking;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @GetMapping("/id")
    public ResponseEntity<Booking> getById(@PathVariable Long id){
        return null;
    }

    @GetMapping("/allByUserId")
    public ResponseEntity<Booking> getAllByUserId(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public ResponseEntity<Booking> getAllByUserId(@RequestBody Booking booking){
        return null;
    }

    @PutMapping("/id")
    public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking , @PathVariable Long id){
        return null;
    }

}
