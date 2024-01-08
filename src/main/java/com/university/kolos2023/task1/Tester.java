package com.university.kolos2023.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Tester {

    private ArrayList<Song> songs = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();
    // вывод песен с выбранного диска в порядке записи
    //1. У нас есть все песни
    //2. Нам пройтись по этому листу и выбрать только те, у которых определенный
    //3. Если подходит, добавляем в другую коллецию
    //4. и на получившуюся коллекцию вызываем сортировку (SongComparator по году)
    //!!!!если в задании просят вернуть какие-то песни, то в методе работаем с песнями, то компоратор для песен!!!
    // сначала фильтрация, потом сортировка

    public void SongsWriterByNameFromCDFromYear(CD cd) {
        ArrayList<Song> resultSongsByDisk = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getCd().equals(cd)) { //фильтрация
                resultSongsByDisk.add(songs.get(i));
            }
        }
        Collections.sort(resultSongsByDisk, new SongYearComporator());
    }

    // вывод песен по алфавиту со всех дисков (по названию)(без повторений)
    public void SongWriterByName() {
        ArrayList<Song> result = songs;
        for (int i = 0; i < songs.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                if (result.get(j).getName().equals(songs.get(i).getName())) {
                    result.remove(j);
                }
            }
        }
        Collections.sort(result, new SongNameComporator());
    }

    //вывод по алфавиту песен данного автора с выбранного диска (вызываю метод сортировки из пункта а)
    public void SongsWriterByName(CD cd, Author a) {
        ArrayList<Song> resultSongsByDisk = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getCd().equals(cd)) { //фильтрация
                resultSongsByDisk.add(songs.get(i));
            }
        }
        ArrayList<Song> resultSongsByAuthor = resultSongsByDisk;
        for (int i = 0; i < resultSongsByDisk.size(); i++) {
            if (resultSongsByDisk.get(i).getAuthor().equals(a)) { //фильтрация
                resultSongsByAuthor.remove(resultSongsByAuthor.get(i));
            }
        }
        Collections.sort(resultSongsByAuthor, new SongNameComporator());
    }

    //вывод по алфавиту всех песен данного автора(тоже самое)(без повторений)
    public void SongsWriterByAuthor(Author a) {
        ArrayList<Song> resultSongsByAuthor = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getAuthor().equals(a)) { //фильтрация
                resultSongsByAuthor.add(songs.get(i));
            }
        }
        Collections.sort(resultSongsByAuthor, new SongNameComporator());
    }

    // вывод по алфавиту всех авторов(сортировка авторов)
    public void AuthorsSort() {
        Collections.sort(authors, new AuthorNameComporator());//не забывать про скобки в конце создания объекта(конструктор)
        System.out.println(authors);//выводить коллекцию, чтобы потом легко вывести в мэйне

        //итератор - типо замена for
        Iterator<Author> iter = authors.iterator();//создаем объект итератора, указываем по какой коллекции будем проходить
        while (iter.hasNext()) { //пока что-то в коллекции есть

            System.out.println(iter.next()); //iter.next() - authors.get(i)
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
       // tester.SongsWriterByAuthor("author", cd);
    }
}
