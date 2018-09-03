package com.springinaction.runtimeInject;

public class Student {

    private String name;

    private String phone;

    private String number;

    public Student(String name, String phone, String number) {
        this.name = name;
        this.phone = phone;
        this.number = number;
    }

    @Override
    public String toString() {
        return "name: " + name + " - phone: " + phone + " - number: " + number;
    }
}
