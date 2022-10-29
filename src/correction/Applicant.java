package correction;

public class Applicant extends Person {
    private String applicationNumber;
    private String className;

    public Applicant(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public void register(String regNumber){
        this.applicationNumber = regNumber ;
    }

    public String  getClassName(){
        return className ;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }
}