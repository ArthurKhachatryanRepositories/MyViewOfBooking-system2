package com.example.myviewofbookingsystem;

import com.example.myviewofbookingsystem.hotel.room.Room;
import lombok.Data;
import java.sql.Date;

@Data
public class CartData {

    public CartData(String cardNumber, String expirationDate, String securityCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    private String cardNumber;
    private String expirationDate;
    private String securityCode;

}
