package correction;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private final Classes  studentClass;
    private final String regNumber;
     private final List<Course> listOfCourses;

    public Student(String name, int age, Classes studentClass, String regNumber) {
        super(name, age);
        this.studentClass = studentClass;
        this.regNumber = regNumber;
        this.listOfCourses = new ArrayList<>() ;

    }

    public void takeCourses(Course course ){
        System.out.println(this.getName() + " is taking the course "+ course.getCourseName() );
    }

    public int canOffend(int noOfOffences){
       return noOfOffences ;

    }

    public int failCourses(int noOfCourses) {
         return noOfCourses;
    }

        public Classes getStudentClass () {
            return studentClass;
        }

        public String getRegNumber () {
            return regNumber;
        }

    }

