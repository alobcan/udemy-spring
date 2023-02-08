package com.alobcan.beans;

import com.alobcan.models.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speakers{
    public String makeSound(Song song) {
        return String.format("Playing the song %1$s by %2$s with Sony Speaker", song.getTitle(), song.getArtist());
    }
}
