package correction2;

public class Staff extends Person {
    private int yearsOfExperience;

    public Staff(String name, int age, int yearsOfExperience) {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Staff{" +  "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() + " "+
                "yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
