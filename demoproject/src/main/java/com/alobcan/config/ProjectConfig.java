package com.alobcan.config;

import com.alobcan.beans.Person;
import com.alobcan.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.alobcan.beans")
public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    @Primary
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Mazda");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }
}
