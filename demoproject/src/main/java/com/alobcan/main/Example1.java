package com.alobcan.main;

import com.alobcan.beans.Vehicle;
import com.alobcan.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> mazdaSupplier = () -> {
          Vehicle mazda = new Vehicle();
          mazda.setName("Mazda");
          return mazda;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("random number = " + randomNumber);

        if ((randomNumber % 2) == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("mazda", Vehicle.class, mazdaSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle mazdaVehicle = null;

        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating Volkswagen vehicle");
        }

        try {
            mazdaVehicle = context.getBean("mazda", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating Mazda vehicle");
        }

        if (null != volksVehicle) {
            System.out.println("Programming Vehicle name from Spring Context is: " + volksVehicle.getName());
        } else {
            System.out.println("Programming Vehicle name from Spring Context is: " + mazdaVehicle.getName());
        }
    }
}
