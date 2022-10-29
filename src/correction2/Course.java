package correction2;

public class Course {
    private String courseName;
    private Teacher teacher ;
    private String  className ;

    public Course(String courseName, String className) {
        this.courseName = courseName;
        this.className = className;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", className='" + className + '\'' +
                '}';
    }
}
