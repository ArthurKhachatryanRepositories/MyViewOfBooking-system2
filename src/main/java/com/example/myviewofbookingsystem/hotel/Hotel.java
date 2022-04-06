package com.example.myviewofbookingsystem.hotel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name;
    String country;
    String city;
    String address;
    String IdentificationNumber;
    // Hotel Type;
    String hotelStar;

    // it has to be comfirmed by  moderator
    boolean confirmed ;

    boolean isDeleted;


}
