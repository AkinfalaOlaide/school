package correction2;

import java.util.ArrayList;
import java.util.List;

public class Main {




    public static void main(String[] args) {

        School school = new School("Model Secondary School") ;

      school.setPrincipal("Mr Bee",57,8) ;

        Applicant applicant = new Applicant("Bola",10,"JSS 2") ;
        Applicant applicant1 = new Applicant("Boje",10,"JSS 1") ;
        Applicant applicant2 = new Applicant("Bolu",10,"JSS 3") ;
        Applicant applicant3 = new Applicant("Bose",9,"JSS 1") ;

        applicant.register("103") ;
        applicant1.register("102") ;
        applicant2.register("101") ;
        applicant3.register("150") ;
        school.setApplicantList((List.of(applicant ,applicant1 ,applicant2,applicant3 )) ) ;


        System.out.println(school.getPrincipal().getName() );


      Course course1 = new Course("Mathematics","JSS 1") ;
      Course course2 = new Course("French Language","JSS 2") ;
      Course course3 = new Course("Physical Education","JSS 1") ;
      Course course4 = new Course("Home Economics","JSS 3") ;
      Course course5 = new Course("English Language","JSS 2") ;
      Course course6 = new Course("English Language","JSS 3") ;
      school.setCourses(List.of(course1,course2,course3,course4 ,course5 ,course6 ) ) ;


        Classes studentClass3 = new Classes("JSS 3") ;
        Classes studentClass2 = new Classes("JSS 2") ;
        Classes studentClass1 = new Classes("JSS 1") ;
        school.setClasses(List.of(studentClass1,studentClass2 ,studentClass3 ) ) ;




        school.getPrincipal().admitApplicants(school.getApplicantList() );

        Teacher teacher = new Teacher("Mr Alao",26,3);
        Teacher teacher2 = new Teacher("Mr Tope",28,7) ;
        Teacher teacher3 = new Teacher("Mrs Bukky",25,4) ;
        Teacher teacher4 = new Teacher("Mrs Joke",28,2) ;
        school.setTeacher(List.of(teacher,teacher2 ,teacher3 ,teacher4 ) ) ;
        teacher.takeCourses(course1 ) ;
        teacher.takeCourses(course5 ) ;
        teacher2.takeCourses(course2 ) ;
        teacher2.takeCourses(course6 ) ;
        teacher3.takeCourses(course3) ;
        teacher4.takeCourses(course4 ) ;


        List<Student> students = school.getStudents();
        for (Student student :students ) {
            System.out.println(student.getName() );
            System.out.println(student.getNotification() );
        }

        List<Classes> classes = school.getClasses();
        for (Classes class1 : classes ) {
            System.out.println(class1.getClassName() );
            System.out.println(class1.getListOfCourses() );
        }
        List<Teacher > teachers = school.getTeacher() ;
        for(Teacher teacher1 : teachers ){
          System.out.println(teacher1.getName() );
          System.out.println(teacher1.getListOfCourses() );
        }

        List<Course> courses = school.getCourses();
        for (Course course :courses ) {
            System.out.println(course.getCourseName() + course.getClassName() );
            System.out.println(course.getTeacher() );
        }

      Student student = students.get(0);
                student .offend("Stealing") ;
                school.getPrincipal().expel(student ) ;
      System.out.println(student.getNotification() );
      System.out.println(school.getStudents() );
      student.offend("Lying") ;
      school.getPrincipal().expel(student ) ;
      System.out.println(student.getNotification() );
      System.out.println(school.getStudents() );


//        School school = new School("MODEL",teacher ,student ,studentClass ,courses  )  ;
//        Principal principal = new Principal("Mr Babalola",25) ;
//        Teachers teachers = new Teachers("Mr Dele",10) ;
//        NonAcademicStaffs nonAcademicStaffs = new NonAcademicStaffs("Mrs Chris",0) ;
//        Students student = new Students("Akinfala Olaide",15) ;
//        Applicant applicant = new Applicant("Babi Johnson", 9) ;
//        Classes classes= new Classes("jss1") ;
//        Courses courses = new Courses("English") ;







    }
}
