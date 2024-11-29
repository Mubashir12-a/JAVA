/*
 * When more then one class have same named methods with same type of parameter or non-parameterized:
 * Override let local method be used over parent or SuperClass method:
 * both methods or more should be same type access modifiers:
 */

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Working...");

        Class_1 obj_1 = new Class_1();
        obj_1.Meth01();

        Class_2 obj_2 = new Class_2();
        obj_2.Meth01();

    }
}

class Class_1 {
    public void Meth01(){
        System.out.println("I am method inside Class_1 named Meth01");
    }
}

class Class_2 extends Class_1 {
    @Override   // Used if parent method will be changed and are no long overriding method so this keyword dont let error come;
    public void Meth01(){
        System.out.println("I am method inside Class_2 named Meth01");
    }
}
