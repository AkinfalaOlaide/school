package correction2;

import java.util.ArrayList;
import java.util.List;

public class School {

    private final String name;
    private  List<Teacher> teacher;
    private List<Student> students;
    private  List<Classes> classes;
    private List<Course> courses;
    private final List<NonAcademicStaff> nonAcademicStaff;
    private Principal principal;
    private List<Applicant> applicantList;


    public School(String name) {
        this.name = name;
        this.teacher = new ArrayList<>();
        this.students = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.nonAcademicStaff = new ArrayList<>();
        this.applicantList = new ArrayList<>();
    }

    public void setStudents(List<Student> student) {
        this.students = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
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

    public void setPrincipal(String name,int age,int yearsOfExperience) {
        Principal principal = new Principal(name,age,yearsOfExperience ) ;
        principal.setSchool(this ) ;
        this.principal = principal;
    }

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(List<Applicant> applicants) {
        for (Applicant applicant : applicants) {

            if (applicant.getApplicationNumber().isEmpty()) {
                System.out.println("Please register as an applicant");
                return;
            }
            this.applicantList.add(applicant);
        }
    }

    public void setCourses(List<Course> courses) {
       this.courses.addAll(courses) ;
    }

    public void setClasses(List<Classes> classes) {
        for (Classes class1 :classes ) {
            class1.addCourse(this.courses ) ;
        }
        this.classes.addAll(classes );
    }


}