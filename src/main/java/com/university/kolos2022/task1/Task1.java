package com.university.kolos2022.task1;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    /*Часть 1)
    Написать программу, которая читает данные строками с клавиатуры и записывает их в текстовый файл в следующем виде:
    Дата заказа товара, например, 12/2022
    Название          Количество         Цена
    Мышка             20                         40.00
    Ноутбук           10                         2500.00

1. sc - спрашиваешь дата какая
2. Записываешь в файл "дата" + введенная дата
3. 1 строка что я нашла в файл
4. sc спрашиваешь сколько товаров добавляем
5. создаем цикл for
6. столько то раз спрашиваем название количество цену
7. в конце каждой итерации for 2 строка что я скинула*/

    public void fileMaker() throws Exception {
        //зажать контрл, нажатб на название класса, переходим в класс, если вижу, что реализуем интерфейс closeble autocloseble ,
        // то эти классы создаем в круглых скобках в try(строка 26-27)

        String fileName = "src/main/resources/file1";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
             Scanner sc = new Scanner(System.in);) {


            System.out.println("Write a data ");
            String data = sc.nextLine();
            writer.write(String.format("%-20s%-15s%-10s%n", "Название", "Количество", "Цена"));
            System.out.println("How many products we add? ");
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.println("Write a name ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.println("Write an amount ");
                int amount = sc.nextInt();
                System.out.println("Write a price ");
                double price = sc.nextDouble();

                writer.write(String.format("%-20s%-15s%-10s%n", name, amount, price));

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        Task1 tester = new Task1();
        tester.fileMaker();
    }
}
