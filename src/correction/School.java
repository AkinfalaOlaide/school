package correction;

import java.util.ArrayList;
import java.util.List;

public class School {

   private final String name;
   private final List<Teacher> teacher;
 private final List<Student >student;
   private final List <Classes> classes ;
    private final List <Course> courses;
    private final List<NonAcademicStaff> nonAcademicStaff;
    private Principal principal ;


    public School(String name, List<Teacher> teacher, List<Student> student,
                  List<Classes> classes, List<Course> courses) {
        this.name = name;
        this.teacher = new ArrayList<>() ;
       this.student = new ArrayList<>() ;
       this.classes = new ArrayList<>() ;
        this.courses = new ArrayList<>() ;
        this.nonAcademicStaff =new ArrayList<>() ;
    }

    public String getName() {
        return name;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<NonAcademicStaff> getNonAcademicStaff() {
        return nonAcademicStaff;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

}
