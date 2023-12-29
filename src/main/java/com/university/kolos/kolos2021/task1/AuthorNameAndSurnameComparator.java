package com.university.kolos.kolos2021.task1;

import java.util.Comparator;

public class AuthorNameAndSurnameComparator implements Comparator<Author> {
    @Override
    public int compare(Author a1, Author a2) {
        int surnameCompare = a1.getAuthorSurname().compareTo(a2.getAuthorSurname());
        if (surnameCompare != 0) {
            return surnameCompare;
        }
        return a1.getAuthorName().compareTo(a2.getAuthorName());
    }
}
// Иванова Аня и Иванова Даша
// 1) сравниваем фамилии, оно вернет 0
// 2) далее сравниваем имена, тк сравнение по фамилиям не показало нам их порядок
// 3) Аня будет первая
// усли бы мы взяли Арбузову Катю и Иванову Аню, то сравнение по именам нам бы не понадобилось,
// тк Арбузова уже первая по фамилии
