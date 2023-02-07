package com.alobcan.main;

import com.alobcan.beans.Vehicle;
import com.alobcan.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name for non-spring context is: " + vehicle.getName());


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean("vehicle3", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);

        Integer num = context.getBean(Integer.class);
        System.out.println(("Integer value from Spring Context is: " + num));
    }
}
