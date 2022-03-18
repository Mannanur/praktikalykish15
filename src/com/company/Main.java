package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Aiperi", 24);
        Teacher teacher1 = new Teacher("Asan", 28);
        Student student = new Student("Nuriza", 18);
        Student student1 = new Student("Batyr", 20);
        EnglishCourse englishCourse = new EnglishCourse(teacher.getName(),student.getName());
        ItCourse itCourse = new ItCourse(teacher1.getName(), student1.getName());



        System.out.println(teacher);
        teacher.canDo();
        System.out.println(teacher1);
        teacher.canDo();
        System.out.println(student);
        student.canDo();
        System.out.println(student1);
        student.canDo();

        System.out.println(englishCourse);
        System.out.println(itCourse);
    }
}
