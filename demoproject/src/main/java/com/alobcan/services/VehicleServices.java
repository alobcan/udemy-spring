package com.alobcan.services;

import com.alobcan.beans.Speakers;
import com.alobcan.beans.Tyres;
import com.alobcan.interfaces.LogAspect;
import com.alobcan.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class VehicleServices {

    private Logger logger = Logger.getLogger(VehicleServices.class.getName());
    @Autowired
    public Speakers speakers;

    @Autowired
    public Tyres tyres;

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {
       return speakers.makeSound(song);
    }

    public String move(boolean vehicleStarted) {
        return tyres.rotate();
    }

    public String brake(boolean vehicleStarted) {
        return tyres.stop();
    }
}
