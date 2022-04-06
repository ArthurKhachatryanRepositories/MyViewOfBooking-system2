package com.example.myviewofbookingsystem.hotel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @GetMapping("/all/byRoomTypeAndDate")
    public ResponseEntity getAllByRoomTypeAndDate(){
    return null;
    }


    @PostMapping
    public ResponseEntity addHotel(@RequestBody Hotel hotel, long userId) {
        return null;
    }



}
