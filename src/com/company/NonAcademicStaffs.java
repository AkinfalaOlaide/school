package com.company;

public class NonAcademicStaffs {
    private String name;
    private int yearOfExperience;

    public NonAcademicStaffs(String name, int yearOfExperience) {
        this.name = name;
        this.yearOfExperience = yearOfExperience;
    }

    public void cleanToilet(int toilet){
        System.out.println(name + " has cleaned " + 5 + "toilets");
    }
}
