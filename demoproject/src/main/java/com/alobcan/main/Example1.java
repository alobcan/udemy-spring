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
        System.out.println("Before Person bean call");
        Person person = context.getBean(Person.class);
        System.out.println("After person bean call");
    }
}
