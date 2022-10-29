package correction;

import java.util.ArrayList;
import java.util.List;

public class Principal extends Staff  {

    private final List<Student> listOfStudents;
    private final List <Classes> listOfClasses ;

    public Principal(String name, int age, int yearsOfExperience ) {
        super(name, age, yearsOfExperience);
        this.listOfStudents = new ArrayList<>() ;
        this.listOfClasses = new ArrayList<Classes>() ;
    }


    public void expel(Student student ) {
        if (student.canOffend(4) > 3) {
            System.out.println(student.getName() + " is expelled by " + getName());
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
        for (int i = 0; i< this.listOfClasses.size() ; i++){
            if(className.equalsIgnoreCase(listOfClasses.get(i).getClassName() )){
                return listOfClasses.get(i) ;
            }
        }
        return null  ;
    }



    public void admitApplicants(Applicant applicant ){
        if(applicant.getApplicationNumber() .isEmpty() ){
            System.out.println("Please register as an applicant");
            return ;
        }

        if(applicant.getAge() >= 10){
            String regNumber = "MSS" + listOfStudents.size() ;
          Classes classes = assignClass(applicant.getClassName() ) ;



            Student student = new Student(applicant.getName(), applicant.getAge(),classes ,regNumber) ;
            listOfStudents.add(student ) ;
            System.out.println(applicant.getName() + " has been offered admission" );
        }
        else{
            System.out.println(applicant.getName() +  " is not admitted");
        }
    }



}
