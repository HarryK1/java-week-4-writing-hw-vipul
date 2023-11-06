package programme_23_method_overriding;
/*
 * Creating a child class
 */
public class Bike extends Vehicle{
    //defining the same method as in parent class
    public void run(){
        System.out.println("Bike is running safly");
    }

    public static void main(String[] args) {
        Bike obj = new Bike(); // creating object
        obj.run(); //called method
    }
}
