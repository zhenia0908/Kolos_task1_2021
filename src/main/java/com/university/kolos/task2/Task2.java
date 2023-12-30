package com.university.kolos.task2;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    /*Текстовый файл содержит список студентов в виде:
    Первая строка — заголовок: Список студентов по направлению «Информатика»
    Вторая строка — в виде: № Фамилия Имя  оценка1 оценка2 оценка3
    Следующие строки имеют форму:
            1     Новак Янв      3.0  4.0  5.0
    Напишите программу, которая читает файл, вычисляет средний балл каждому ученику и сохраняет данные
    в новый файл в том же виде, что и в исходном файле, дополненном элементом Средняя оценка.
    Продемонстрируйте работу программы, имена файлов читайте с клавиатуры.
    Part1
    создать текстовый файл
    заполниь файл информацией
    Part2
    создание методов
    метод readFile, который читает файл
    метод copyFile, который делает новый файл и добавляет среднюю оценку
    метод midleGrade, который считает среднюю оценку
    сканер, чтобы читать файлы с клавиатуры


     */

    public void Maker(){
        
    }
    public void readFile(String fileName) throws Exception {
        // Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 /*   public void copyFile() throws Exception {
        try (InputStream input = new BufferedInputStream(new FileInputStream("src/main/resources/list_of_students"));
             OutputStream output = new BufferedOutputStream(new FileOutputStream("src/main/resources/list_of_students_2"))) {
            while (input.available() > 0) { //смотрит есть ли строки
                int data = input.read();
                output.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
1. Читаешь файл построчно
2. Разбиваешь на составляющие
3. Индекс 0 - порядковый номер
4. 1 и 2 - имя и фамилия
5. 3 4 5 - оценки
6. исходя из них считаешь средний балл
7. дописываешь в конец строки*/
    public void midleGrade() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/list_of_students"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/list_of_students_2"))) {
            String line;
            double midleGrade = 0;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split("\\s+");

                for (int i = 3; i< parts.length; i++) {
                    midleGrade += (Double.parseDouble(parts[i]))/3;
                }
                String newLine = line + "   " + midleGrade + "\n";
                bw.write(newLine);
              midleGrade = 0;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {

        Task2 tester = new Task2();
        tester.readFile("src/main/resources/list_of_students");
        tester.midleGrade();
        tester.readFile("src/main/resources/list_of_students_2");

    }
}
