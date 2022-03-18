package com.company;

public class Course{
    private String mugalimdinAty;
    private String studenttinAty;

    public Course(String mugalimdinAty, String studenttinAty) {
        this.mugalimdinAty = mugalimdinAty;
        this.studenttinAty = studenttinAty;
    }

    public String getMugalimdinAty() {
        return mugalimdinAty;
    }

    public void setMugalimdinAty(String mugalimdinAty) {
        this.mugalimdinAty = mugalimdinAty;
    }

    public String getStudenttinAty() {
        return studenttinAty;
    }

    public void setStudenttinAty(String studenttinAty) {
        this.studenttinAty = studenttinAty;
    }
}
