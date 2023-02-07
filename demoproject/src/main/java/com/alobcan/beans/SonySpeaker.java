package com.alobcan.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speakers{
    public void makeSound() {
        System.out.println("Sony speaker makes sound");
    }
}
