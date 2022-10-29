package correction2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal extends Staff {
    private School school;

    public Principal(String name, int age, int yearsOfExperience ) {
        super(name, age, yearsOfExperience);

    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void expel(Student student ) {
        if (student.getOffences().size() > 1) {
            this.school.getStudents() .remove(student ) ;
     String message = student.getName() + " has been expelled because the student committed more than one offence.";
            Map < String,ArrayList<String> > notification = student.getNotification();
            ArrayList<String> student_status = notification.get("Student status");
            student_status.add(message) ;
            notification.put("Student status",student_status ) ;
        }
    }



    public void repeatStudent(Student student ){
        if(student.failCourses(7) > 5 ){
            System.out.println(student.getName() + " has repeated the same class");
        }else{
            System.out.println(student.getName() + " is promoted to the next class");
        }
    }



    public void employTeacher(Teacher teacher ){
        if(teacher.getYearsOfExperience() >= 10){
            System.out.println(getName() + " has employed "  + teacher.getName() + " because he/she has " +
                    teacher.getYearsOfExperience() + " years of experience.");
        }else{
            System.out.println(getName() + " cannot employ "  + teacher.getName() + " because he/she has " +
                    teacher.getYearsOfExperience() + " years of experience." );
        }
    }




    public void employNonAcademicStaff(NonAcademicStaff nonAcademicStaff ){
        if(nonAcademicStaff.getYearsOfExperience() >= 0){
            System.out.println(nonAcademicStaff.getName() + " has been employed by " + getName() );
        }
    }




    public Classes assignClass(String className){
        List<Classes > classes = school.getClasses() ;
        for (int i = 0; i< classes .size() ; i++){
            if(className.equalsIgnoreCase(classes.get(i).getClassName() )){
                Classes  class1 = classes.get(i);
                return class1  ;
            }
        }
        return null  ;
    }



    public void admitApplicants(List <Applicant> applicants ) {
        for (Applicant applicant : applicants) {

            if (applicant.getAge() >= 10) {
                String regNumber = "MSS" + school.getStudents() .size();
                Classes classes = assignClass(applicant.getClassName());
                Student student = new Student(applicant.getName(), applicant.getAge(), classes, regNumber);
                student.takeCourses() ;
                this.school.getStudents() .add(student);
                String message = student.getName() + " has been offered admission";
                Map < String,ArrayList<String> > notification = student.getNotification();
                ArrayList<String> student_status = notification.getOrDefault("Student status",new ArrayList<>() ) ;
                student_status.add(message) ;
                notification.put("Student status",student_status ) ;
            }
        else{
                System.out.println(applicant.getName() + " is not admitted");
            }
        }
    }

}
