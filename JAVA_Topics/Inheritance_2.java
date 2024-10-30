/**
 * Inheritance_2: More On Constructors in Inheritance and Use of Super keyword and This keyword.
 */


// Overloaded Constructors:

class Cons_1{
    Cons_1(){
        System.out.println("Constructor With out Parameter from Cons_1 ");
    }

    Cons_1(int num){
        System.out.println("Constructor With Parameter Num from Cons_1 " + num);
    }

    Cons_1(int a, int b){
        System.out.println("Constructor With 2 parameter from Cons_1 " + (a + b));
    }

    //Q. Which One will Be displayed? --> without Parameter Constructor is always displayed by default.
    //Q. How we can display Another Constructors?  --> Using super keyword.
}


class Cons_2 extends Cons_1 {
    
    Cons_2(){
        super(10); // ---> Parameter as per functions to access.
        System.out.println("Constructor With out Parameter from Cons_2 ");
    }

    Cons_2(int num){
        super(num, 30);
        System.out.println("Constructor With Parameter Num from Cons_2 " + num);
    }    
}    


/*
 * super keyword: 
 * ---> Use super to access parent class methods and fields, 
 *      particularly when they are shadowed by child class members.
 * ---> Use super() to call the parent class constructor when creating an instance of a subclass, 
 *      which helps in proper initialization of the inheritance chain.
 */





// Inheritance (Grand Parent, Parent, child, Grand child, etc):

class GrandParent {
    public void msg_1(){
        System.out.println("I am Grand Parent");
    }    
}    

class Parent extends GrandParent{
    public void msg_2(){
        System.out.println("I am Parent");
    }    
}    

class Child extends Parent{
    public void msg_3(){
        System.out.println("I am Child");
    }    
}    

class GrandChild extends Child{
    public void msg_4(){
        System.out.println("I am Grand Child");
    }    
}    





public class Inheritance_2 {

    public static void main(String[] args) {

        // Cons_2 obj = new Cons_2();
        // Cons_2 obj = new Cons_2(10);

        
        GrandChild msg = new GrandChild();

        msg.msg_1();
        msg.msg_2();
        msg.msg_3();
        msg.msg_4();
        
    }
}