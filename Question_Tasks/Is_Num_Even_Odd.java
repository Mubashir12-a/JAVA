import java.util.Scanner;

public class Is_Num_Even_Odd {
    public static void main(String[] args) {

        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = inpt.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number Is Even");
        } else {
            System.out.println("Number Is Odd");
        }

        inpt.close();
    }
}