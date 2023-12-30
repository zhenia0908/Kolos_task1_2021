package com.university.kolos2022.task1;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    int howManyProducts;


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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {


            System.out.println("Write a data ");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            writer.write(data + "\n");
            writer.write(String.format("%-20s%-15s%-10s%n", "Название", "Количество", "Цена"));
            System.out.println("How many products we add? ");
            Scanner sc1 = new Scanner(System.in);
            howManyProducts = sc1.nextInt();

            for (int i = 0; i < howManyProducts; i++) {
                System.out.println("Write a name ");
                Scanner sc2 = new Scanner(System.in);
                String name = sc2.nextLine();

                System.out.println("Write an amount ");
                Scanner sc3 = new Scanner(System.in);
                int amount = sc3.nextInt();

                System.out.println("Write a price ");
                Scanner sc4 = new Scanner(System.in);
                double price = sc4.nextDouble();


                writer.write(String.format("%-20s%-15s%-10s%n", name, amount, price));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Часть2)
Написать программу, которая читает предыдущий файл и записывает в новый в следующем виде:
Порядковый номер        Название     Количество      Цена            Стоимость
1                       Ноутбук       10            2500.00          25000.00
2                       Мышка         20             40.00            800.00
(Посортировать по алфавиту по названию)
В отдельный файл вынести товары, количество которых равно 0(в виде п.н., назв., цена), отсортировать по уменьшению стоимости.


*/
    public void fileUpdater() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/file1"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/file2"))) {
            String line = br.readLine();
            bw.write(line + "\n");
            br.readLine();
            bw.write(String.format("%-20s%-20s%-15s%-10s%-25s%n", "Порядковый номер", "Название", "Количество", "Цена", "Стоимость"));

            double value;

            for (int i = 1; i <= howManyProducts; i++) {
                line = br.readLine();
                String [] newLine = line.split("\\s+");//не важно сколько пробелов
               double a =  Double.parseDouble(newLine[1]);
               double b =  Double.parseDouble(newLine[2]);
                value = a*b;

                bw.write(String.format("%-20d%-60s%-1s%n", i, line, value));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Task1 tester = new Task1();
        tester.fileMaker();
        tester.fileUpdater();
    }
}
