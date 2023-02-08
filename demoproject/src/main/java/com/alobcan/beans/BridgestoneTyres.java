package com.alobcan.beans;

import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyres implements Tyres {
    public String rotate() {
        return  "Bridgestone tyres rotate";
    }

    public String stop() {
        return "Bridgestone tyres Stop";
    }
}
