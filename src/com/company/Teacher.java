package com.company;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void canDo(){
        System.out.println(" okutat");

    }
    @Override
    public String toString(){

        return "Mugalimdin aty - " + getName() + " jasy - " + getAge();
    }
}
