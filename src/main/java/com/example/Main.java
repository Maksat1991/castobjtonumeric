package com.example;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(111111111111111111L);
        student.setGrade(10);

        System.out.println("age class = " + student.getAge().getClass());
        System.out.println("grade class = " + student.getGrade().getClass());
    }

}
