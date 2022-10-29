package correction;



import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff   {

    private final List<Course> listOfCourses;
    private final List<Classes > listOfClasses;


    public Teacher(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
        this.listOfCourses = new ArrayList<>() ;
        this.listOfClasses = new ArrayList<>() ;
    }

    public List<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void takeCourses(Course course ){
        System.out.println(this.getName() +" teaches " +  course.getCourseName());
    }




}



