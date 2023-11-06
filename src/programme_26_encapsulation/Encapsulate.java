package programme_26_encapsulation;

public class Encapsulate {
    //private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    //set method for same name to access private variable age
    public String getName() {
        return name;
    }

    //get method for roll nos to access private variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    //set method for roll nos to access private variable rollNo
    public int setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return rollNo; // additional line added
    }

    //get method for age to access private variable age
    public int getAge(){
        return age;
    }
    //set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
    this.name = name;
    }
}
