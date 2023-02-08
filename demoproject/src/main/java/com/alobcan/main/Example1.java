package com.alobcan.main;

import com.alobcan.config.ProjectConfig;
import com.alobcan.models.Song;
import com.alobcan.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example1 {

    public static void main(String[] args) throws InterruptedException {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setArtist("BMTH");
        song.setTitle("Doomed");

        boolean vehicleStarted = true;

        String moveVehicleStatus = vehicleServices.move(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
        String applyBrakeStatus = vehicleServices.brake(vehicleStarted);
    }
}
