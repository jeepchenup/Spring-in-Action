package com.springinaction.addressAmbiguity;

public class Cookies implements Dessert{

    private String name;

    public Cookies(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("I created " + name);
    }
}
