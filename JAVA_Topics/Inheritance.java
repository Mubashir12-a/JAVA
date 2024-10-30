/**
 * Inheritance
 */

class Greet {
    public void hello(){
        System.out.println("Hello How Are you?");
    }

    private void bye(){
        System.out.println("Good Bye");
    }

    public void getBye(){
        this.bye();
    }
}


class Message extends Greet{
    public void Cong(){
        System.out.println("Congrats user");
    }

    public void Sry(){
        System.out.println("Sorry User");
    }

    public void invalid(){
        System.out.println("Invalid information");
    }
}





class Sound {
    public void Bow(){
        System.out.println("Bow Bow");
    }

    public void meow(){
        System.out.println("Meow Meow");
    }

    public void kaw(){
        System.out.println("kaw kaw");
    }
}


class Animal extends Sound {
    public void dog(){
        System.out.print("Dog : ");
    }

    public void cat(){
        System.out.print("Cat :");
    }

    public void crow(){
        System.out.print("Crow : ");
    }
}


// Explaination : [ Sound ] is a class and [ Animal ] is also class but when we used [ Sound ] with
//                [ Animal ] like Animal extends Sound there [ Animal ] became child of [ Sound ].






public class Inheritance {
    public static void main(String[] args) {

        // Without Inheritance:

        Greet greet = new Greet();
        Message msg = new Message();

        greet.hello();      // Hello How Are you?
        msg.Cong();         // Congrats user
        // greet.bye();     // Error: because bye() is private
        greet.getBye();     // Good Bye


        System.out.println();

        // With Inheritance:

        msg.hello();        // Hello How Are you?
        msg.Cong();         // Congrats user
        //msg.bye();        // Error: Same reason private.
        msg.getBye();       // Good Bye



        System.out.println();

        // New Example:

        Animal obj = new Animal();

        obj.dog();
        obj.Bow();

        Sound obj_2 = new Sound();

        obj_2.Bow();


        // Constructor in Inheritance:

        Base object_1 = new Base();          // Message as a constructor (from Base)
        Derived object_2 = new Derived();   /* Message as a constructor from Base if its own constructor is not available otherwise 
                                               Derived own constructor wakes up not Base constructor. */

        object_1.setX(5);      // object_1 X = 5;
        object_2.setY(10);     // object_2 Y = 10 but X remains 0;

        System.out.println(object_2.getX() + object_2.getY());          // Using Inheritance. but output will be 10 as only Y is value is given in this object_2;
        System.out.println(object_1.getX() + object_2.getY());          // Using Inheritance. output will be 15 because both object_1 X and object_2 Y value is given;

        /* Those both objects are different so they dont share values if object_1 X = 5 were initialised using object method but object_2 X is not initialised its still NULL. */


        
    }
}





// Constructors in Inheritance:

class Base {
    public int x;

    public Base(){
        System.out.println("Message as a constructor");
    }

    public void setX(int n){
        x = n;
    }

    public int getX(){
        return x;
    }
}

class Derived extends Base {
    public int y;

    public void setY(int n){
        y = n;
    }

    public int getY(){
        return y;
    }

}