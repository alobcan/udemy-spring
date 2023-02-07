package com.alobcan.config;

import com.alobcan.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Mazda");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}
