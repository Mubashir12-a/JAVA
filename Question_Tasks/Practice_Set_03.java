import java.util.Scanner;

public class Practice_Set_03 {
    public static void main(String[] args) {
        /*  Q.2: Calculate Income tax paid by an employee to the 
                 government as per the slabs mentioned below?

                 Income slab        tax
                 2.5L - 5.0L         5%
                 5.0L - 10.0L        20%
                 Above 10.0L         30%
        */ 

        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter The Income: ");
        int income = inpt.nextInt();

        inpt.close();

        if (income < 250000) {
            System.out.println("There is no tax below 2.5L");
            System.exit(0);
        }


        if (income > 250000 && income < 500000) {
            System.out.println("Tax to pay : 5% (" + ((income / 100) * 5) + ")");
        }
        else if (income > 500000 && income < 1000000) {
            System.out.println("Tax to pay : 20% (" + ((income / 100) * 20) + ")");
        }
        else if (income > 1000000) {
            System.out.println("Tax to pay : 30% (" + ((income / 100) * 30) + ")");
        }
        else {
            // Nothing
        }
    }
}
