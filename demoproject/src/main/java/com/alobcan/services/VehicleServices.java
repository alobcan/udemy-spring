package com.alobcan.services;

import com.alobcan.beans.Speakers;
import com.alobcan.beans.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {
    @Autowired
    public Speakers speakers;

    @Autowired
    public Tyres tyres;

    public void turnOnSpeakers() {
        speakers.makeSound();
    }

    public void move() {
        tyres.rotate();
    }
}
