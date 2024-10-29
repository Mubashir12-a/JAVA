// Access Modifiers: access modifiers are keywords that set the visibility and accessibility of classes, methods,
//                   and variables. There are four types of access modifiers:
/* 
*   public: Accessible from anywhere in the program.
*   private: Accessible only within the class where it is declared.
*   protected: Accessible within the same package or subclasses (even in different packages).
*   default (no modifier): Accessible only within the same package.
*/

public class Access_Modifiers {
    public static void main(String[] args) {

        MyEmployee person = new MyEmployee();

        person.id = 154827;             // Default
        person.name = "Mubashir";       // public
    //  person.address = "Soura";       // private  (creates error)
        person.setAddrs("Soura");       // Using Setters to initialize private.

        System.out.println(person.getAddrs());     // Using getters to access private.

        person.setAddrs("Srinagar");
        System.out.println(person.getAddrs());

    
        Phone_Num num = new Phone_Num();

        num.setNumber(7889825292l);
        num.setNumber(917889825292l);
        
    }
}

class MyEmployee {
    long id;                             
    public String name;
    private String address;

    public void setAddrs(String n){
        // address = n;            
        this.address = n;            // same as address = n;
    }

    public String getAddrs(){
        return address;
    }
}


class Phone_Num {
    private long contact;

    public void setNumber(long n){
        if(n >= 1000000000l && n <= 9999999999l){
            contact = n;
            System.out.println("Your Contact is " + this.contact);
        }
        else {
            System.out.println("Wrong number its less or greater than 10-digits");
        }
    }
}
