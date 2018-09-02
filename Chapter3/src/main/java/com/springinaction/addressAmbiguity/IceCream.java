package com.springinaction.addressAmbiguity;

public class IceCream implements Dessert{

    private String name;

    public IceCream(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("I created " + name);
    }
}
