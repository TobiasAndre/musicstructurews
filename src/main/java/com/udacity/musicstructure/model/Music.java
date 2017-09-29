package com.udacity.musicstructure.model;

public class Music {
    private String name;
    private String album;
    private String artist;

    public Music(String iName,String iAlbum,String iArtist){
        this.name = iName;
        this.album = iAlbum;
        this.artist = iArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
