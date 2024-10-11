public class Conditional_Statements {
    public static void main(String[] args) {
        /* 
        --> if condition:

        if (condition) {
            // if condition is true then this program will run.
            // program
        }

        --> if-else condition:

        if (condition) {
            // if condition is true then this program will run.
            // program
        }
        else {
            // if cindition was false then this program will run.
            // program
        }

        --> if-elseif-else condition:

        if (condition) {
            // if condition is true then this program will run.
            // program
        }
        else if(condition){
            // if cindition was false then this program will run.
            // program
        }
        */

        byte age = 18;

        if(age > 17){
            System.out.println("Yes, you can drive");
        }
        else{
            System.out.println("No, you can't drive");
        }

        if(age < 15){
            System.out.println("Yes! you can play here.");
        }
        else if(age < 20){
            System.out.println("No, you can't play here.");
        }
        else {
            // Nothing!
        }


        /*
         * Retional Operators:
         * Relational operators are symbols used to compare two values, resulting in a boolean outcome (true or false).
         * { == }, { >= }, { > }, { < }, { <= }, { != };
         */


        byte num = 10;

        if(num == 10){
            System.out.println("num == 10");
        }
        
        if (num >= 10) {
            System.out.println("num >= 10");
        }
        
        if (num <= 10) {
            System.out.println("num <= 10");
        }
        
        if (num > 10) {
            System.out.println("num > 10");
        }
        
        if (num < 10) {
            System.out.println("num < 10");
        }
        
        if (num != 10){
            System.out.println("num != 10");
        }


        /*
         * Logical Operator:
         * Logical operators are used to combine or modify boolean expressions, returning true or false. The main logical operators are.
         * AND operator: { && }: One should be true then output is true else false.
         * OR operator: { || }: both should be true then output is true else false.
         */


         boolean T_1 = true;
         boolean T_2 = true;
         boolean F_1 = false;
         boolean F_2 = false;

         if (T_1 && T_2) {
            System.out.println("True");
         }

         if (T_1 && F_1) {
            System.out.println("False");
         }

         if (T_1 || T_2) {
            System.out.println("True");
         }

         if (T_1 || F_1) {
            System.out.println("False");
         }

         if (F_1 || F_2) {
            System.out.println("False");
         }

    }
}
