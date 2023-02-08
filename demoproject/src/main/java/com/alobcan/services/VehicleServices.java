package com.alobcan.services;

import com.alobcan.beans.Speakers;
import com.alobcan.beans.Tyres;
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

    public String playMusic(boolean vehicleStarted, Song song) {
        String music = null;
        if (vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        return music;
    }

    public String move(boolean vehicleStarted) {
        String status = null;
        if (vehicleStarted) {
            status = tyres.rotate();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        return status;
    }

    public String brake(boolean vehicleStarted) {
        String status = null;
        if (vehicleStarted) {
            status = tyres.stop();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        return status;
    }
}
