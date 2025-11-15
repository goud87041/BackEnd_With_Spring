package com.example.internalWorkingOfSpring;

import org.springframework.stereotype.Controller;

// you can use all the below for making been of any class  instate of @component


// @Component
// @Service
// @RestController      
// @Repository
@Controller
public class abhiPayMethode implements  PaymentSecvices {
    @Override
    public String Pay(){
        String  Payment = "abhi payment";
        System.out.println("Rezor Payment " +Payment);
        return Payment ;
    }


}
