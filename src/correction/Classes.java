package correction;

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

}
