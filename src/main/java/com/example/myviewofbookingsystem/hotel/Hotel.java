package com.example.myviewofbookingsystem.hotel;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name;

    @OneToOne
    HotelAddress hotelAddress;

    String IdentificationNumber;

    // Hotel Type;

    int hotelStar;

    // it has to be comfirmed by  moderator
    boolean confirmed ;

    boolean isDeleted;

}
