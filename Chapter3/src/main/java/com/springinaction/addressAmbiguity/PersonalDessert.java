package com.springinaction.addressAmbiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonalDessert {

    @Autowired
    @Qualifier("iceCream")
    private Dessert dessert;

    public void showDessert() {
        dessert.say();
    }
}
