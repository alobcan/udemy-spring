package com.alobcan.services;

import com.alobcan.beans.Speakers;
import com.alobcan.beans.Tyres;
import com.alobcan.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
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
        Instant start = Instant.now();
        logger.info("method execution start");
        String music = null;
        if (vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info(String.format("The method took %1$s ms to execute", timeElapsed));
        return music;
    }

    public String move(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if (vehicleStarted) {
            status = tyres.rotate();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info(String.format("The method took %1$s ms to execute", timeElapsed));
        return status;
    }

    public String brake(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if (vehicleStarted) {
            status = tyres.stop();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info(String.format("The method took %1$s ms to execute", timeElapsed));
        return status;
    }
}
