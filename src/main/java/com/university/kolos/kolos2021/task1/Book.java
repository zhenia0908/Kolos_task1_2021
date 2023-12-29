package com.university.kolos.kolos2021.task1;
//этот интерфейс(Comparable) указывает на то, что в данном классе будет переопределен метод compareTo
// для того, чтобы указать правила сортировки книг
// задаем условие сравнения, что должно быть вначале и что в конце

//Comparable(compareTo) можно использовать только 1 правило сортировки
public class Book implements Comparable<Book> {
    // private поля - это безопасное хранение данных(инкапсуляция)
    private Author author;
    private String name;
    private int number;

    public Book() {
    }

    // поля идут в том же порядке, что и сверху
    public Book(Author author, String name, int number) {
        this.author = author;
        this.name = name;
        this.number = number;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author autor) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
/*  каждая итерация попарное сравнение
первыйОбъектСравнение.compareTo(второйОбъектСравнения)
-1 - первый меньше
0 - равны
1 -  первый больше*/
    @Override
    public int compareTo(Book o) {
        return this.getAuthor().getAuthorSurname().compareTo(o.getAuthor().getAuthorSurname());
    }
}
