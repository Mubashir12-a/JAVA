// Q.1: Create a class Employee with following properties and methods:
/*
 * Salary (int)
 * getSalary (returning int)
 * name (String)
 * getName (returning String)
 * setName (changing name)
 */


class Employee {
    int salary;
    int getSalary(){
        return salary;
    }
    String name;
    String getName(){
        return name;
    }
    void setName(String newName){
        name = newName;
    }
}



// Q.2: Create a class CellPhone with methods to print "ringing", "vibrating", etc:

class CellPhone {
    void ringing(){
        System.out.println("Phone is ringing...");
    }

    void vibrating(){
        System.out.println("Phone is vibrating...");
    }

    void callingTo(String name){
        System.out.println("Calling to " + name);
    }
}



// Q.3: Create a class Square with a method to initialize its side, calculating area, perimeter etc:

class Square {
    int side;
    String units;
    
    void area(){
        System.out.printf("Area is : %d %s^2 \n", (side * side), units);
    }

    void perimeter(){
        System.out.printf("Perimeter is : %d %s \n", (4 * side), units);
    }

    void diagonal(){
        System.out.printf("Diagonal is : %.3f %s \n", (side * 1.414), units);  /*(root of 2 is 1.414)*/
    }
}

 

// Q.4: Create a class TommyVercetti for Rockstar games capable of hitting, running, firing etc:

class TommyVercetti {
    void hit(){
        System.out.println("Hitting...");
    }

    void run(){
        System.out.println("Running...");
    }

    void fire(){
        System.out.println("Firing...");
    }
}



// Q.5: 



public class Practice_Set_08 {
    public static void main(String[] args) {
        // Q.1:

        Employee User01 = new Employee();
        User01.salary = 20000;
        User01.name = "Mubashir";

        System.out.println(User01.name + " have " + User01.salary + " salary ");
        System.out.println("User name is : " + User01.getName());
        User01.setName("Mubashir Ahmad");
        System.out.println("User new name is : " + User01.getName());


        // Q.2:

        CellPhone phone01 = new CellPhone();

        phone01.ringing();
        phone01.vibrating();
        phone01.callingTo("Mubashir");
        phone01.callingTo("Friend");


        // Q.3:

        Square Sq_01 = new Square();

        Sq_01.side = 4;
        Sq_01.units = "cm";

        Sq_01.area();
        Sq_01.perimeter();
        Sq_01.diagonal();


        // Q.4:

        TommyVercetti player = new TommyVercetti();

        player.hit();
        player.run();
        player.fire();

    }
}
