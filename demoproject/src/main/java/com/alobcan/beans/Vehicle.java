package com.alobcan.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vehicle {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
