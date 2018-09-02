package com.springinaction.addressAmbiguity;

public class Cake implements Dessert{
    private String name;

    public Cake(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("I created " + name);
    }
}
