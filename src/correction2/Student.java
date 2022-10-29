package correction2;

import java.util.*;

public  class Student extends Person {
    private final Classes studentClass;
    private final String regNumber;
     private final List<Course> listOfCourses;
     private final List<String> offences;
     private final Map <String,ArrayList<String > > notification;

    public Student(String name, int age, Classes studentClass, String regNumber) {
        super(name, age);
        this.studentClass = studentClass;
        this.regNumber = regNumber;
        this.listOfCourses = new ArrayList<>() ;
        this.offences = new ArrayList<>();
        this.notification = new HashMap<>() ;

    }

    public void takeCourses(){
        List<Course> listOfCourses = studentClass.getListOfCourses();
        for (Course course :listOfCourses) {
            this.listOfCourses.add(course ) ;
            String message = "You have successfully opted in for  " + course.getCourseName() ;
            ArrayList<String> courses = notification.getOrDefault("Courses", new ArrayList<>());
            courses.add(message ) ;
            notification.put("Courses",courses ) ;
        }

    }

    public void offend(String offence){
        offences.add(offence) ;

        if(offences.size() == 1){
            String message = getName() +" ,I am giving you a strong warning for this first offence committed," +
                    " one more offence and you are expelled." ;
            ArrayList<String> offences = notification.getOrDefault("Offences", new ArrayList<>());
            offences .add(message ) ;
            notification.put("Offences",offences  ) ;

        }

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

    public List<String> getOffences() {
        return offences;
    }

    public Map<String, ArrayList<String>> getNotification() {
        return notification;
    }
}

