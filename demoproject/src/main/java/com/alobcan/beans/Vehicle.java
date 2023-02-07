package com.alobcan.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }
    private String name = "Mazda";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }
}
