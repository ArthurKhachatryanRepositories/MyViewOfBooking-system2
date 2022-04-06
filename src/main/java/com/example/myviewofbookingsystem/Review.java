package com.example.myviewofbookingsystem;

import com.example.myviewofbookingsystem.hotel.room.Room;
import com.example.myviewofbookingsystem.user.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

   // @OneToOne
    //User user;

    //Room room;

    String comment;

    int points;


    Date date;

    //  as moterador can delet it
    boolean isDeleted;

}
