package com.company;

public class Teachers {
    private String teacherName;
    private int yearOfExperience;

    public Teachers(String teacherName, int yearOfExperience) {
        this.teacherName = teacherName;
        this.yearOfExperience = yearOfExperience;
    }

    public String getName() {
        return teacherName ;
    }

    public int getYearOfExperience() {
        if(yearOfExperience > 3){
            System.out.println("Teacher has  " + yearOfExperience + " year of experience");
        }
        return yearOfExperience;
    }


    public void teachCourses(){
        System.out.println(teacherName + "teaches");

    }
}
