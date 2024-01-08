package com.university.kolos2023.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Task2 {
    /*Задание 2
Текстовый файл содержит список студентов следующего вида(сделать с помощью, например, Notepad’a(не знаю имел ли он в виду программу или блокнот)) :
Специальность информатика
Оценки с предмета программирование
Новак Ян              (123456)         5.0  4.0
Ковальский Адам       (654321)         5.0  5.0

Написать программу, которая читает тот файл, считает для каждого студента среднюю оценку и записывает данные в виде:
Специальность информатика
Список студентов, которые получили зачет
Номер студента       Номер_индекса    Фамилия_имя      Ср_оценка
1                     654321          Kowalski Adam     5.0
2                     123456          Nowak Jan         4.5

a)в один файл записывать студентов с средней оценкой  >= 3.0
остальных в другой.
Добавляет подзаголовок: Список студентов, сдавших
b) в другой файл записывать студентов с средней оценкой  < 3.0
отсортированных по фамилии и имени в порядке возрастания
Добавляет подзаголовок: Список студентов, не сдавших

*/
    public void fileReader() throws Exception { //указываем путь к файлу, если точка, то все равно слеш
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/university/kolos2023/task2/file1"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/university/kolos2023/task2/passed"));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter("src/main/java/com/university/kolos2023/task2/unpassed"))) {
            String line;
            int i = 1;
            int j = 1;
            Double middleGrade;
            bw.write(String.format("%-20s%-20s%-20s%-20s%n", "Номер студента", "Номер индекса", " Фамилия имя", "Ср оценка"));
            bw1.write(String.format("%-20s%-20s%-20s%-20s%n", "Номер студента", "Номер индекса", " Фамилия имя", "Ср оценка"));
            while ((line = br.readLine()) != null) {
                String[] res = line.split("\\s+");//!!! ВЫУЧИТЬ
                double a = Double.parseDouble(res[4]);
                double b = Double.parseDouble(res[5]);
                String index = res[3];
                ArrayList<String> name = new ArrayList<>();
                name.add(res[1]);
                name.add(res[2]);
                        middleGrade = (a + b) / 2;

                if (middleGrade >= 3) {

                    bw.write(String.format("%-20s%-20s%-20s%-20s%n", i, index, name, middleGrade));
                    i++;
                } else {

                    bw1.write(String.format("%-20s%-20s%-20s%-20s%n", j, index, name, middleGrade));
                    j++;
                }
               // i++;//поставить в правильное место
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reader(String fileName) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Task2 tester = new Task2();
        tester.fileReader();
        System.out.println("Passed");
        tester.reader("src/main/java/com/university/kolos2023/task2/passed");
        System.out.println("Unpassed");
        tester.reader("src/main/java/com/university/kolos2023/task2/unpassed");

    }
}
