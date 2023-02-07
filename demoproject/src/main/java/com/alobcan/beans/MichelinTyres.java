package com.alobcan.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    public void rotate() {
        System.out.println("Michelin tyres rotate");
    }
}
