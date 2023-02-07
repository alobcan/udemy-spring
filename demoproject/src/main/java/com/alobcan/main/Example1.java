package com.alobcan.main;

import com.alobcan.beans.Vehicle;
import com.alobcan.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component vehicle name from Spring Context is: " + vehicle.getName());
        vehicle.printHello();
        context.close();
    }
}
