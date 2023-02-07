package com.alobcan.main;

import com.alobcan.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Example1 {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
    }
}
