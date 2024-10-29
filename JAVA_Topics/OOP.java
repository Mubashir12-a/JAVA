/*
 
    What is oop?
    --> Object-oriented programming (OOP) is a programming paradigm that organizes software design around data, 
        or objects, rather than functions. In OOP, programs are structured into classes that define the properties 
        and behaviors of objects. Objects are instances of these classes and can interact with each other, enabling 
        code reuse and modularity. This approach helps manage complexity in software development by allowing for 
        easier maintenance and scalability.

    
    OOP terminology:

    --> Classes: A class is a blueprint for creating objects in object-oriented programming. 
        It defines a set of attributes (data) and methods (functions) that describe the properties 
        and behaviors of the objects created from it. When you create an object from a class, 
        it inherits these attributes and methods, allowing you to manipulate the object's state 
        and behavior. Classes help organize code and promote reuse, making it easier to manage 
        and understand complex systems.


    --> Object's: An object is an instance of a class in object-oriented programming. 
        It represents a specific entity that combines data (attributes) and behaviors 
        (methods) defined by its class. Each object has its own unique state, determined 
        by the values of its attributes. Objects can interact with one another by calling 
        each other's methods, allowing for dynamic and flexible program behavior. 
        In essence, objects serve as the building blocks of OOP, enabling the modeling 
        of real-world entities and their interactions.


    --> Abstraction: Abstraction in programming is the idea of hiding complicated details 
        and showing only the essential parts to the user. It helps you focus on what an 
        object does instead of how it does it. 

        For example, when you drive a car, you don't need to know how the engine works; 
        you just need to know how to use the steering wheel, pedals, and buttons. 

        Abstraction requires core concept of Polymorphism.


    --> Encapsulation: Encapsulation is an Object-Oriented Programming (OOP) concept that 
        refers to the practice of bundling the data (attributes) and methods (functions) 
        that operate on that data into a single unit called a class. It also involves 
        restricting direct access to some of the object's components, which helps to 
        protect the integrity of the data.

        Encapsulation is fundamentally about controlling access to the data within a class 
        using access modifiers like public, private, and protected.


    --> Inheritance: Inheritance is another fundamental concept in Object-Oriented Programming (OOP) 
        that allows a new class (called a subclass or child class) to inherit properties and behaviors 
        (attributes and methods) from an existing class (called a superclass or parent class). 
        This promotes code reuse and establishes a hierarchical relationship between classes.


    --> Polymorphism: Polymorphism is another fundamental concept in Object-Oriented Programming (OOP) 
        that allows methods to do different things based on the object that it is acting upon. 
        The term "polymorphism" comes from Greek, meaning "many shapes." In Java, polymorphism enables 
        you to call the same method on different objects and have each object respond in its own way.






 */

class Greet {                                    /* Class outside Main Class.    In Single file only single parent class should be public and others 
*                                                                                Without Encapsulation (Public, Private, Protected).*/
    public void hello(){
        System.out.println("Hello How are you?");
    };

    public void goodbye(){
        System.out.println("Good Bye!");
    };
}



// Abstraction:

abstract class Abstraction {
    abstract void car_start();
    abstract void car_stop();
}

class Car extends Abstraction {
    void car_start(){
        System.out.println("Car Started Ready to drive");
    }

    void car_stop(){
        System.out.println("Car Stopped Can't Drive anymore");
    }
}

class Car_2 extends Abstraction {
    void car_start(){
        System.out.println("Car Speed is 40km/h");
    }

    void car_stop(){
        System.out.println("car speed is 0km/h");
    }
}



// Inheritance:

class Car_infor {
    void speed(int s){
        System.out.println(s + "km/h");
    }
}


class Car_3 extends Car_infor {
    void speed(int s){
        System.out.println(s + "km/h");
    }

    void messge(){
        System.out.println("Speed is too much");
    }
}




// Polymorphism:

class Calulate_Sum {

    void add(int a, int b){
        System.out.println(a + b);
    }

    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    void add(int ...num){
        int sum = num[0];

        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }

        System.out.println(sum);
    }

    void add(double a, double b){
        System.out.println(a + b);
    }
}




public class OOP {                                       // This is main class where program is compiled.

    static class Calculator{                        // Another Class inside Main class.
        static int sum(int ...arr){
            int sum = arr[0];

            for(int i = 0; i < arr.length; i++){
               sum = sum + arr[i];
            };

            return sum;
        };

        int sub(int ...arr){
            int sub = 0;

            for(int i = 0; i < arr.length; i++){
                sub = sub + arr[i];
            };

            return sub;
        };
    }

    public static void main(String[] args) {            // This is method or a member of (public class OOP) responsible for execution.
        
        int resl_1 = Calculator.sum(10, 20, 50, 20, 100);
        
        Calculator cal = new Calculator();              // This is object here to get access of class bluprint and to access of member called sub() method.
        int resl_2 = cal.sub(50,20,-30,10);

        System.out.println("SUM = " + resl_1);
        System.out.println("SUB = " + resl_2);



        Greet greet = new Greet();

        greet.hello();
        greet.goodbye();




        // Abstraction:

        Car car = new Car();

        car.car_start();
        car.car_stop();

        Car_2 car_2 = new Car_2();

        car_2.car_start();
        car_2.car_stop();




        // Inheritance:

        Car_infor car_info = new Car_infor();

        car_info.speed(50);

        Car_3 car_3 = new Car_3();

        car_3.speed(80);
        car_3.messge();
        
        

        // Polymorphism:

        Calulate_Sum sum_cal = new Calulate_Sum();

        sum_cal.add(10, 40);
        sum_cal.add(10, 50, 40);
        sum_cal.add(10, 5, 15, 30, 40);
        sum_cal.add(20.5, 80.15);


    }
}
