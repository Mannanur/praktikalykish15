package com.company;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }
    @Override
    public void canDo(){
        System.out.println(" okuit");

    }
    @Override
    public String toString(){

        return "Studentti aty - " + getName() + " jasy - " + getAge();
    }
}
