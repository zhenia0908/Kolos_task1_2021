package com.university.kolos2023.task1;

import java.util.Comparator;

public class SongNameComporator implements Comparator<Song> {
    public int compare(Song o1, Song o2){
        return o1.getName().compareTo(o2.getName());
    }
}
