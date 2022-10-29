package com.company;

public class School {
   private Principal principal ;
   private Teachers teachers ;
   private NonAcademicStaffs nonAcademicStaffs ;
    private Students students;
    private Applicant applicant ;
    private Classes classes ;
    private  Courses  courses ;

    public School(Principal principal, Teachers teachers, NonAcademicStaffs nonAcademicStaffs,
                  Students students, Applicant applicant, Classes classes, Courses courses) {
        this.principal = principal;
        this.teachers = teachers;
        this.nonAcademicStaffs = nonAcademicStaffs;
        this.students = students;
        this.applicant = applicant;
        this.classes = classes;
        this.courses = courses;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public Teachers getTeachers() {
        teachers.teachCourses() ;
        return teachers;
    }

    public NonAcademicStaffs getNonAcademicStaffs() {
        return nonAcademicStaffs;
    }

    public Students getStudents() {
        students.takeCourses();
        return students;
    }

    public Applicant getApplicant() {
        principal.admitApplicants(10);
        return applicant;
    }

    public Classes getClasses() {
        return classes;
    }

    public Courses getCourses() {
        return courses;
    }

    public void expulsion(){
       principal .offences(3) ;

    }


}
