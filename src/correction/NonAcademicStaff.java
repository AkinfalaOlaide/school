package correction;

import java.util.ArrayList;
import java.util.List;

public class NonAcademicStaff extends Staff   {
   private final List<Classes > listOfClasses;

    public NonAcademicStaff(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
        this.listOfClasses = new ArrayList<>() ;
    }

    public void work(int typeOfWork){
        System.out.println(getName() + " has done " + typeOfWork + " type of work");
    }


}

