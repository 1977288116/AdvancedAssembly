package com.chenjl.config;

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc {

    private String title;

    private String artist;

    public BlankDisc() {

    }

//    public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}")String artist) {
//        this.title = title;
//        this.artist = artist;
//    }
    public BlankDisc(@Value("#{systemProperties['disc.title']}") String title,
                     @Value("#{systemProperties['dis.artist']}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
