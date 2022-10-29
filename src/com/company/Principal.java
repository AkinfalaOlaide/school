package com.company;

public class Principal {
    private String name;
    private int yearsOfExperience;

    public String getName() {
        return name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Principal(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }
    public void offences(int noOfOffences){
        if(noOfOffences >= 3){
            System.out.println("Student is expelled");
        }
    }

    public void admitApplicants(int age){
        if(age > 10){
            System.out.println("ADMITTED");
        }
        else{
            System.out.println("NOT ADMITTED");
        }
    }

}
