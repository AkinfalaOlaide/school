package correction2;

import java.util.ArrayList;
import java.util.List;

public class Classes {
    private final String className;
    private final List<Course> listOfCourses ;


    public Classes(String className) {
        this.className = className;
        this.listOfCourses = new ArrayList<>() ;
    }

    public String getClassName() {
        return className;
    }

    public List<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void addCourse(List <Course> courses ){
        for(Course course :courses ){
            if(course.getClassName().equalsIgnoreCase(this.className ) ){
                this.listOfCourses.add(course ) ;
            }
        }

    }

}
