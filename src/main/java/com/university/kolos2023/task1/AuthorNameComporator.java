package com.university.kolos2023.task1;

import java.util.Comparator;

public class AuthorNameComporator implements Comparator<Author> {


    @Override
    public int compare(Author o1, Author o2) {
        return o1.getName().compareTo(o2.getName());//метод compare, но вызываем compareTo, чтобы сказать программе какие поля сравнивать
    }
}
