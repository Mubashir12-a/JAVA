public class Practice_Set_05 {
    public static void main(String[] args) {
        // Q.1: Write a program to print the following pattern?
        /*
                * * * *
                * * *
                * *
                *
         */

         for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4 - i; j++){
                System.out.print(" * ");
            }
            System.out.println();
         }

         System.out.println();




         // Q.2: Write a program to sum first n even numbers using while loop?

         byte num = 0, n = 10;
         int sum = 0;


         while(num < n){
            num += 2;
            sum = sum + num;
         }

         System.out.println("The sum of first " + n + " even numbers = " + sum);

         System.out.println();




         // Q.3: Write a program to print multiplication table of a given number n?

         byte n_2 = 5;

         for(int i = 1; i <= 10; i++){
            System.out.println(n_2 + " x " + i + " = " + n_2*i);
         }

         System.out.println();



         // Q.4: Write a program to print multiplication table of n in reverse?

         for(int i = 10; i > 0; i--){
            System.out.println(n_2 + " x " + i + " = " + n_2*i);
         }

         System.out.println();



         // Q.5: Write a program to find the factorial of given n number using for loop?

         byte n_3 = 5;
         int fact = 1;

         for(int i = 1; i <= n_3; i++){
            fact = fact * i;
         }

         System.out.println("The factorial of " + n_3 + " = " + fact);


         System.out.println();




         // Q.6: Write a program to calculate the sum of the numbers occuring in the multiplication table of 8?

         int sum_2 = 0;
         byte n_4 = 8;
         int multiple = 0;

         for(int i = 1; i <= 10; i++){
            multiple = n_4 * i;
            sum_2 = sum_2 + multiple;
         }

         System.out.println("the sum of the numbers occuring in the multiplication table of 8 = " + sum_2);


    }
}
