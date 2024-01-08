package com.university.kolos2023.task1;

import java.util.Comparator;

public class CDYearComporator implements Comparator<CD> {
    public int compare(CD o1, CD o2) {
        int year1 = o1.getSong().getYear();
        int year2 = o2.getSong().getYear();
        if (year1 < year2) {
            return -1;
        } else if (year1 > year2) {
            return 1;
        } else {
            return 0;
        }
    }
}
