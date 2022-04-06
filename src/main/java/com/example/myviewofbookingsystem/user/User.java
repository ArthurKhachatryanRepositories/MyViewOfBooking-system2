package com.example.myviewofbookingsystem.user;


import com.example.myviewofbookingsystem.Review;
import com.example.myviewofbookingsystem.booking.Booking;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    UserType userType;
    String name;
    String surname;
    String email;
    String password;


    @OneToMany
    private List<Booking> bookings;

    @OneToMany
    private List<Review> reviewList;

    // as the moderator can lock the user
    boolean locked;

    // for security
    boolean enabled;

    // for security
    boolean credentialsnonexpired;

    // for security
    boolean accountNotExpired;

    boolean isDeleted;
}
