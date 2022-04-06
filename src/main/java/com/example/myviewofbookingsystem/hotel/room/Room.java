package com.example.myviewofbookingsystem.hotel.room;

import com.example.myviewofbookingsystem.Review;
import com.example.myviewofbookingsystem.hotel.Hotel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //  Boolean reservedForDay ;


    Hotel hotel ;

    // it has to be comfirmed by  moderator
    boolean confirmed ;



    String number;
    String RoomRole;
    String RoomPrice;
    String country;
    String roomPicture;
    String roomDescription;

    @OneToMany
    List<Review> reviews;


}
