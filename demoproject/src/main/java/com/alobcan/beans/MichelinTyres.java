package com.alobcan.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    public String rotate() {
        return "Michelin tyres rotate";
    }

    public String stop() {
        return "Michelin tyres Stop";
    }
}
