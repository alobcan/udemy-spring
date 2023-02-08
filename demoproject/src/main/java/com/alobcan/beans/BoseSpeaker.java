package com.alobcan.beans;

import com.alobcan.models.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {
    public String makeSound(Song song) {
        return String.format("Playing the song %1$s by %2$s with Bose Speaker", song.getTitle(), song.getArtist());
    }
}
