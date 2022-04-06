package com.example.myviewofbookingsystem.booking;


import com.example.myviewofbookingsystem.hotel.room.Room;
import com.example.myviewofbookingsystem.user.User;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE
            , CascadeType.DETACH, CascadeType.REFRESH})
    // @JoinColumn(name = "xxx_id")
    private User user;

    @OneToOne
    private Room room;

    private boolean forMe;

    private String name;
    private String lastName;
    private String mail;

    // @OneToOne
    // CartData cartData;

    private Date beginDate;
    private Date endDate;

    private BookingStatus bookingStatus;

}
