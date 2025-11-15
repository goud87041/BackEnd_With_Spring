package com.example.internalWorkingOfSpring;

import org.springframework.stereotype.Component;

@Component
public class RazorPaymentMethode implements PaymentSecvices {

     String  Payment = "Reazor payment";
     
    @Override
    public String Pay(){
       
        System.out.println("Rezor Payment " +Payment);
        return Payment ;
    }
}
