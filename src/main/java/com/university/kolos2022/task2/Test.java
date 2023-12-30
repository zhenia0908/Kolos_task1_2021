package com.university.kolos2022.task2;

public class Test {
    private int mark;
    private String subject;

    public Test(int mark, String subject) {
        this.mark = mark;
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Test{" +
                "mark=" + mark +
                ", subject='" + subject + '\'' +
                '}';
    }
}
