package com.company;

public class ItCourse extends Course{
    public ItCourse(String mugalimdinAty, String studenttinAty) {
        super(mugalimdinAty, studenttinAty);
    }
    @Override
    public String toString() {
        return "IT Mugalimdin aty - " + super.getMugalimdinAty() + ", Studenttin aty - " + super.getStudenttinAty();
    }
}
