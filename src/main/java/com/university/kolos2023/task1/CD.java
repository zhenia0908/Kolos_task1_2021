package com.university.kolos2023.task1;

import java.util.ArrayList;

public class CD {
    private String katalogNumber;
    private Song song;
    public CD(){}
    public CD(String katalogNumber, Song song){
        this.katalogNumber = katalogNumber;
        this.song = song;

    }

    public String getKatalogNumber() {
        return katalogNumber;
    }




    public Song getSong() {
        return song;
    }

    public void setKatalogNumber(String katalogNumber) {
        this.katalogNumber = katalogNumber;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "CD{" +
                "katalogNumber='" + katalogNumber + '\'' +
                ", song=" + song +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CD cd = (CD) o;

        if (!katalogNumber.equals(cd.katalogNumber)) return false;
        return song.equals(cd.song);
    }


}
