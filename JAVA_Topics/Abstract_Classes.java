// Abstract Means A thought without physical or concrete existence;
// What we thing but not implement, a thought;


// Abstract Method? ==> A method without implementation, without braces, its declared with abstract keyword;  abstract void Add(int a, int y);
// An abstract can be only inside abstract class;

/* e.g:
abstarct class A {

    abstract void fn();
}
*/

// abstract class object can't be initailized;
//      --->  A a = new A(); Wrong way Error;
//      --->  A a = new B(); Works fine;

public class Abstract_Classes {
    public static void main(String[] args) {
        System.out.println("Working...");

        //A a = new A();    // Error
        A a = new B();
        A a_2 = new C();

        a.Greet();
        a_2.Greet();

        B b = new B();
        b.Greet();

        C c = new C();
        c.Greet();

        //D d = new D();   // Error
        D d = new E();
        //d.fn();             // Error: because this extended class should override parents abstract method or this class should be abstract as well;
        d.fn();
    }
}


abstract class A {
    A(){
        System.out.println("I am Constructor A");
    }

    abstract void Greet();    // Child classes can override the parent abstract methods;
}

class B extends A {

    @Override
    void Greet(){
        System.out.println("Good Morning");
    }
}

class C extends A {

    @Override
    void Greet(){
        System.out.println("Good afternoon");
    }
}

abstract class D extends A {

    public void fn(){
        System.out.println("I am new method in D");
    }

    abstract void Greet_2();
}

class E extends D {

    void Greet(){                                     // abstract method must be override if its class is extended with childs; 
        System.out.println("I am Class E Greet");     // child should override it else it creates error;
    }

    void Greet_2(){
        System.out.println("I am Class E Greet_2");
    }
}
