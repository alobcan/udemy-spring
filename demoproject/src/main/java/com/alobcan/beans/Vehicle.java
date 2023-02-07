package com.alobcan.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Mazda";
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
