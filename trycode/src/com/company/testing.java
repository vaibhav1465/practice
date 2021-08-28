package com.company;
class student
{
    String name;

    public student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class testing {
    public static void main(String[] args) {
        student name1=new student("vaibhav");
        if("name"==name1.getName())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
