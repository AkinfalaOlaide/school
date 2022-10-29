package com.company;

public class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void takeCourses( ){
        System.out.println(name + " is taking the course " );
    }

    public void offences(int noOfOffences){
        if(noOfOffences >= 3){
            System.out.println("Student is expelled");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
