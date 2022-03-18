package com.company;

public class EnglishCourse extends Course{
    public EnglishCourse(String mugalimdinAty, String studenttinAty) {
        super(mugalimdinAty, studenttinAty);
    }

    @Override
    public String toString() {
        return "English Mugalimdin aty - " + super.getMugalimdinAty() + ", Studenttin aty - " + super.getStudenttinAty();
    }


}
