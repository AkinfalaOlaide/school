package correction2;



import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff {

    private final List<Course> listOfCourses;



    public Teacher(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
        this.listOfCourses = new ArrayList<>() ;
    }

    public List<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void takeCourses(Course course ){
        course.setTeacher(this) ;
        listOfCourses.add(course);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}



