package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Aiperi", 24);
        Teacher teacher1 = new Teacher("Asan", 28);
        Student student = new Student("Nuriza", 18);
        Student student1 = new Student("Bater", 20);


        System.out.println(teacher);
        teacher.canDo();
        System.out.println(teacher1);
        teacher.canDo();
        System.out.println(student);
        student.canDo();
        System.out.println(student1);
        student.canDo();
    }
}
