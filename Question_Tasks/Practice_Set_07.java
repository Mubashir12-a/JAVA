public class Practice_Set_07 {

    // Q.1:

    static void table(int n){
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d \n", n, i, n*i);
        }
    }


    // Q.2: 

    void pattern(int n){
        for(int i = 0; i < n; i++){
            for(int ii = 0; ii < (n - 1) - i; ii++){
                System.out.print(" ");
            }

            for(int iii = n; iii > (n - 1) - i; iii--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    // Q.3: 

    int sum(int n){
        if(n <= 0){
            return 0;
        }

        return n + sum(n - 1);
    }



    // Q.4:

    void pattern_2(int n){
        for(int i = 0; i < n; i++){
            for(int ii = 0; ii < n - i; ii++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    // Q.5:

    int fibo(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }




    // Q.6:

    float avg(float ...arr){
        float sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        float avg = sum / arr.length;

        return avg;
    }



    // Q.7:

    void pattern_3(int n){
        if(n <= 0){
            return;
        }

        pt_3(n);
        System.out.println();
        pattern_3(n - 1);
        
    }

    void pt_3(int n){
        if(n <= 0){
            return;
        }

        System.out.print("* ");
        pt_3(n - 1);
    }




    // Q.8:   (Pending)

    void pattern_4(int n){

        if(n <= 0){
            return;
        }

        pattern_4_spcs(n);
        pt_4(n, 5);

        System.out.println();

        pattern_4(n - 1);
    }

    void pattern_4_spcs(int n){
        if(n <= 0){
            return;
        }

        System.out.print(" ");
        pattern_4_spcs(n - 1);
    }

    void pt_4(int n, int i){

        if(n > i){
            return;
        }

        System.out.print("* ");
        pt_4(n + 1, i);
    }
    






    public static void main(String[] args) {
        
        // Q.1: Write a Java method to print the multiplication table of a number n.
        System.out.println("\nQuestion 01:\n");

        table(5);


        // Q.2: Write a program using functions to print the following pattern:
        /*              *
        *              * *
        *             * * *
        *            * * * *
         */
        System.out.println("\nQuestion 02:\n");
        
        
        Practice_Set_07 obj = new Practice_Set_07();
        
        obj.pattern(5);
        
        
        
        // Q.3: Write a recursive function to calculate the sum of first n natural numbers.
        System.out.println("\nQuestion 03:\n");
        
        int s = obj.sum(10);
        System.out.println(s);
        
        
        
        // Q.4: Write a function to print the following pattern:
        /*      * * * *
        *      * * *
        *      * *
        *      *
        */
        System.out.println("\nQuestion 04:\n");
        
        obj.pattern_2(5);
        
        
        
        // Q.5: Write a function to print the nth term of the Fibonacci series using recursion.
        System.out.println("\nQuestion 05:\n");
        
        System.out.println(obj.fibo(10));
        
        
        
        // Q.6: Write a function to find the average of a set of numbers passed as arguments.
        System.out.println("\nQuestion 06:\n");
        
        System.out.println("Average is : " + obj.avg(10.5f, 50, 60.25f, 40, 25));
        
        
        
        
        // Q.7: Write a function to print the following pattern Using recursion:
        /*      * * * *
        *      * * *
        *      * *
        *      *
        */
        System.out.println("\nQuestion 07:\n");
        
        obj.pattern_3(5);
        
        
        
        
        
        // Q.8: Write a program using functions to print the following pattern using recursion:
        /*              *
        *              * *
        *             * * *
        *            * * * *
         */
        System.out.println("\nQuestion 08:\n");


        obj.pattern_4(5);    // (Pending)




        
        


    }
}
