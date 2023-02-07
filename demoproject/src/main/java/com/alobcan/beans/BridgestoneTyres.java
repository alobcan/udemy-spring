package com.alobcan.beans;

import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyres implements Tyres {
    public void rotate() {
        System.out.println("Bridgestone tyres rotate");
    }
}
