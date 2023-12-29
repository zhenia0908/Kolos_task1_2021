package com.university.kolos.kolos2021.task1;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryTester {
    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<Author> authors = new ArrayList<>();

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public Author addAuthor(Author a) {
        authors.add(a);
        return a;
    }

    //Collections - это вспомогательный класс, в котором имеются методы для работы с коллекциями, например
    // поиск минимального/максимального, поиск и т.д.
    public void getBooksSortedByAuthor() {
        Collections.sort(books);
    }

    //Collections.sort(authors, СЮДА)
    // с помощью корпоратора можно задать несколько правил сравнения, и когда мы вызываем метод сорт,
// нам нужно указать каким именно корпоратором мы будем сортировать
    //!!!! при использовании корпоратора или компэрэбл, то в треугольных скобках пишем класс,
// объекты которого будем сравнивать
    public void getAuthorSortedByName() {
        Collections.sort(authors, new AuthorNameComparator());
    }

    public void getAuthorSortedBySurname() {
        Collections.sort(authors, new AuthorSurnameComparator());
    }

    public void getGetAuthorSortedByNameAndSurnameFirstMethod() {
        Collections.sort(authors, new AuthorNameAndSurnameComparator());
    }


    public void getGetAuthorSortedByNameAndSurnameSecondMethod() {
        Collections.sort(authors, new AuthorSurnameComparator().thenComparing(new AuthorNameComparator()));
    }

    public void changeIndexForBooks(String word) {
        for (int i = 0; i < books.size(); i++) {
            //toLowerCase() - метод, который убирает заглавные буквы
            //toUpperCase - все буквы в заглавные
            //contains() - проверяет есть ли эта часть в строке, на которую вызван метод
            if (books.get(i).getName().toLowerCase().contains(word.toLowerCase())){
                books.get(i).setNumber(0);
                //в случае сеттеров значение, которое мы хотим присвоить мы пишем в скобках в качестве параметра
            }
        }
    }


    public static void main(String[] args) {
        LibraryTester tester = new LibraryTester();
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Олег", "Пушкин");
        Author author3 = new Author("Сергей", "Есенин");
        Author author4 = new Author("Влодимир", "Маяковский");
        // Author author5 = new Author("", "");
        // Author author6 = new Author("", "");
        // Author author7 = new Author("", "");

        Book book1 = new Book(author1, "История Беларуси", 23);
        Book book2 = new Book(author2, "История Великобритании", 45);
        Book book3 = new Book(author3, "Стихи", 67);
        Book book4 = new Book(author4, "Что то", 89);
        tester.addBook(book1);
        tester.addBook(book2);
        tester.addBook(book3);
        tester.addBook(book4);
        System.out.println("Collection of books in the beginning " + books);
        tester.addAuthor(author1);
        tester.addAuthor(author2);
        tester.addAuthor(author3);
        tester.addAuthor(author4);
        System.out.println("Collection of authors in the beginning " + authors);
        tester.getGetAuthorSortedByNameAndSurnameFirstMethod();
        System.out.println("Collection sorted by name and surname fm " + authors);
        tester.getAuthorSortedByName();
        System.out.println("Collection sorted by name " + authors);
        tester.getAuthorSortedBySurname();
        System.out.println("Collection sorted by surname" + authors);
        tester.getBooksSortedByAuthor();
        System.out.println("Collection sorted by authors " + books);
        tester.getGetAuthorSortedByNameAndSurnameSecondMethod();
        System.out.println("Collection sorted by name and surname sm " + authors);
        tester.changeIndexForBooks("История");
        System.out.println("Indexes chanched " + books);
    }
}

