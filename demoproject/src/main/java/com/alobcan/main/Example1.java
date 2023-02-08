package com.alobcan.main;

import com.alobcan.beans.Person;
import com.alobcan.beans.Vehicle;
import com.alobcan.config.ProjectConfig;
import com.alobcan.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);

        System.out.println("Hashcode of vehicleService1: " + vehicleServices1.hashCode());
        System.out.println("Hashcode of vehicleService2: " + vehicleServices2.hashCode());
        if (vehicleServices2 == vehicleServices1) {
            System.out.println("Vehicle Service is a singleton");
        } else {
            System.out.println("Vehicle is a prototype");
        }
    }
}
