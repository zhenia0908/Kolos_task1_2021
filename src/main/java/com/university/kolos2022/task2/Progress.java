package com.university.kolos2022.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class Progress implements Comparator<Progress> {
    private Student student;
    private ArrayList<Test> tests;
    private  double middleGradeValue;


    public Progress(Student student, ArrayList<Test> tests) {
        this.student = student;
        this.tests = tests;
    }
    public Progress(){}//всегда создавать пустой конструктор

    /*1. Вытягиваем сначала из Progress ArrayList<Test>
    2. int sum - сумма оценок
    3. int count - количество оценок
    2 и 3 пункт ты делаешь циклом for
    4. делишь, получаешь среднее
    5. делаешь для второго прогресса то же самое
    6. среднийбалл1.compareto(срб2)*/
    public double middleGrade(Progress o) {
        double count = 0;
        double sum1 = 0;
        for (int i = 0; i < o.getTests().size(); i++) {
            sum1 += o.getTests().get(i).getMark();
            count++;
        }
        double middleGrade = sum1 / count;
        return middleGrade;
    }
    /*1. Создаешь объект Progress для вызова метода
2. Считаешь value1 (для this)
3. Считаешь value2 (для параметра)
4. 1.compareTo(2)

1. Добавляем до переменную middleGradeValue
2. В геттере вызываем функцию middleGrade*/

    public int compare(Progress o1, Progress o2) {//сравнить средние баллы
        double value1 = o1.middleGrade(o1);
        double value2 = o2.middleGrade(o2);
       return o1.getMiddleGradeValue().
    }
    public Student getStudent() {
        return student;
    }

    public double getMiddleGradeValue() {
        return this.middleGrade(this);
    }

    public ArrayList<Test> getTests() {
        return tests;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTests(ArrayList<Test> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "Progress{" +
                "student=" + student +
                ", tests=" + tests +
                '}';
    }

    public static void main(String[] args) {


        Student student = new Student(" ", " ");
        Test test = new Test(4, " ");
        Test test1 = new Test(5, " ");
        //код читается сверху вниз, сначала создаем, потом туда добавляем
        ArrayList<Test> ty = new ArrayList<>();
        ty.add(test);
        ty.add(test1);
        Progress progress = new Progress(student, ty);
        System.out.println(progress.middleGrade(progress));
    }
}
