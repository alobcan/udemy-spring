package com.alobcan.beans;

import com.alobcan.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    @Autowired
    private VehicleServices vehicleServices;

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

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }

    public void turnOnCar() {
        vehicleServices.turnOnSpeakers();
        vehicleServices.move();
    }
}
