/**
 * Constructors:
 * constructor is a special method used to initialize objects.
 * It has the same name as the class and no return type. 
 * There are two main types:

*   Default Constructor: No parameters, initializes fields with default values.
*   Parameterized Constructor: Accepts parameters to set initial values for object attributes.
 */
class State{

    private int pincode;
    private String name;
    private String state;

    // Constructor: (Parameterized Constructor)

    public State(String s){                 // Constructor Name should be same as class name.
        this.pincode = 190009;
        this.name = "Srinagar";
        this.state = s;
    }

    // Constructor Overloading:

    public State(int pin, String name, String state){
        this.pincode = pin;
        this.name = name;
        this.state = state;
    }

    public void setPin(int n){
        pincode = n;
    }

    public void setName(String n){
        name = n;
    }

    public int getPin(){
        return pincode;
    }

    public String getName(){
        return name;
    }

    public String getState(){
        return state;
    }
}



public class Constructors {
    public static void main(String[] args) {

        State S1 = new State("Kashmir");
        
        System.out.println(S1.getPin());     // 190009
        System.out.println(S1.getName());    // Srinagar
        
        S1.setName("Soura");
        S1.setPin(190011);
        
        System.out.println(S1.getPin());      // 190011
        System.out.println(S1.getName());     // Soura

        System.out.println(S1.getState());     // Kashmir


        System.out.println("\n");

        // Constructor overloading:

        State S2 = new State(190012, "Hawal", "J&K");

        System.out.println(S2.getName());
        System.out.println(S2.getPin());
    }
}
