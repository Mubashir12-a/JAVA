public class recursion_fn {

    // factorial of number:

    int fact(int num){
        if(num == 1 || num <= 0){
            return num;
        }

        return num * fact(num - 1);
    }


    // fibonacci sequence :

    /*
    *    fibo(5)
    *    │
    *    ├── fibo(4)
    *    │   ├── fibo(3)
    *    │   │   ├── fibo(2)
    *    │   │   │   ├── fibo(1) = 1
    *    │   │   │   └── fibo(0) = 0
    *    │   │   └── fibo(1) = 1
    *    │   └── fibo(2)
    *    │       ├── fibo(1) = 1
    *    │       └── fibo(0) = 0
    *    └── fibo(3)
    *        ├── fibo(2)
    *        │   ├── fibo(1) = 1
    *        │   └── fibo(0) = 0
    *        └── fibo(1) = 1
    *
     */

    void fibo(int a, int b, int range){
        int s = a + b;

        if (s <= range) {
            System.out.println(s);
            fibo(b, s, range);
        }
    }

    public static void main(String[] args) {

        // Recursion when a function call itself inside his block;

        recursion_fn fn = new recursion_fn();

        fn.fibo(0, 1, 8);

    }
}
