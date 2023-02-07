package com.alobcan.beans;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {
    public void makeSound() {
        System.out.println("Bose speaker makes sound");
    }
}
