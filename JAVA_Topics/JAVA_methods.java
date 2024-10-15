/**
 * JAVA_methods
 * methods are same as functions.
 * 
 * static keyword: is used to define members (variables, methods, blocks, and nested classes) 
 *                 that belong to the class itself, rather than to any specific instance (object) 
 *                 of that class. When something is marked as static, it can be accessed without 
 *                 creating an instance of the class, and there is only one copy of that member 
 *                 shared across all instances of the class.
 */
public class JAVA_methods {

    // Function or Method:
    // With Static keyword:
    
    static int cal(int x, int y){
        int z;

        if(x > y){
            z = x + y;
        }
        else{
            z = x * y;
        }

        return z;
    }

    // Without Static keyword its an object:

    int sum(int x, int y){
        int s;

        s = x + y;

        return s;
    }

    int mul(int x, int y){
        int m;

        m = x * y;

        return m;
    }


    /////////////////////////////////////////////////////

    static void greeting(String name){
        System.out.printf("Hello %s How are you today! \n", name);
    }

    /////////////////////////////////////////////////////

    static void changeVar(int x){
        x = 125; // Changes the local copy
        // This copy of 'number' cannot be accessed outside this method
    }

    /////////////////////////////////////////////////////

    static void changeArr(int [] arr){
        arr[0] = 100;
    }


    //////////////-Method Overloading-///////////////////

    // Below methods name's are same but working different:

    static void foo(){
        System.out.println("I am foo() method");
    }

    static void foo(String n){
        System.out.println("I am foo() method using name i.e; = " + n);
    }

    static void foo(String n, long x){
        System.out.println("I am foo() method using name i.e; = " + n + " Contact = " + x);
    }
    







    // Main Function:
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // With Static keyword:

        int c = cal(a, b);

        System.out.println(cal(a, b));
        System.out.println(c);



        // Without Static keyword:

        JAVA_methods obj_1 = new JAVA_methods();     

        int d = obj_1.sum(a, b);

        System.out.println(d);
        System.out.println(obj_1.sum(50,100));

        int e = obj_1.mul(a, b);

        System.out.println(e);
        System.out.println(obj_1.mul(20, 6));


        
        // Greeting:

        greeting("Mubashir");


        // Change variable: can't be changed;

        int v = 20;

        System.out.println("before change var: " + v);

        changeVar(v);

        System.out.println("after change var (fn) : " + v);


        // Changing array: it will change.
        /*
         * Primitive types: Passed by value, so changes inside the method do not affect the original variable.
         * 
         * Reference types (like arrays): The reference to the object is passed by value, 
         *                                allowing modifications to the contents of the object 
         *                                (like an array) to affect the original object outside the method.
         */

        int [] arr_1 = {10, 20, 30, 40, 50};

        changeArr(arr_1);

        System.out.println(arr_1[0]);


        // Method Overloading:
        // Two or more methods can have same name, same data-type but different paramenters and use:

        

        foo();                               // foo()
        foo("Mubashir");                     // foo(String n)
        foo("Naruto", 919796154879l);        // foo(String n, long x)

    }
}