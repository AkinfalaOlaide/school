package correction;

import java.util.List;

public class Main {




    public static void main(String[] args) {


      Principal principal = new Principal("Mr Bee",52,25) ;
        Applicant applicant = new Applicant("Bola",10,"JSS 2") ;
      applicant.register("1234") ;
       principal.admitApplicants(applicant ) ;


        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("Aunty bose",35,
                4);
        Classes studentClass = new Classes("JSS3") ;

        Course courses = new Course("English Language") ;
        Teacher teacher = new Teacher("Mr Alao",26,3) ;
        teacher.takeCourses(courses ) ;
        Student student = new Student("Akinfala Olaide",13,studentClass ,"MSS104") ;
       student.takeCourses(courses ) ;
       principal.expel(student ) ;
       principal.repeatStudent(student ) ;
       principal.employTeacher(teacher) ;
       principal.employNonAcademicStaff(nonAcademicStaff ) ;
       nonAcademicStaff.work(2) ;




















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
