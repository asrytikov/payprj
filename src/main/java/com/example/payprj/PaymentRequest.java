package com.example.payprj;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {

    private int userId;
    private String itemId;
    private double discount;

}
