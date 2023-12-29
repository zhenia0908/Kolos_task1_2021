package com.university.kolos.kolos2021.task1;

import java.util.Comparator;

public class AuthorSurnameComparator implements Comparator<Author> {
    @Override
    public int compare(Author a1, Author a2) {
        return a1.getAuthorSurname().compareTo(a2.getAuthorSurname());
    }
}

