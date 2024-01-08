package com.university.kolos2023.task1;

import java.util.Comparator;

public class SongYearComporator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int year1 = o1.getYear();
        int year2 = o2.getYear();
        if(year1<year2){
            return -1;
        } else if (year1>year2) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
