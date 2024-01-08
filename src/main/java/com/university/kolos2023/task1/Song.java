package com.university.kolos2023.task1;

import org.springframework.context.annotation.EnableMBeanExport;

public class Song {
    private String name;
    private Author author;
    private int year;
    private CD cd;
    public Song(){}
    public Song(String name, Author author, int year, CD cd){
        this.name = name;
        this.author = author;
        this.year = year;
        this.cd = cd;
    }

    public String getName() {
        return name;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (year != song.year) return false;
        if (!name.equals(song.name)) return false;
        return author.equals(song.author);
    }


}
