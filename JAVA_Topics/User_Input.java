import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner inpt = new Scanner(System.in);


        System.out.print("Enter num-1: ");
        int a = inpt.nextInt();

        System.out.print("Enter num-2: ");
        int b = inpt.nextInt();

        System.out.print("The Sum of Num-1 and Num-2 is : ");
        System.out.println(a + b);

        System.out.print("Enter Name: ");
        System.out.println("Your name is " + inpt.next());

        inpt.nextLine();

        System.out.print("Enter Address: ");
        String add = inpt.nextLine();
        System.out.println("Your Address is : " + add);

        inpt.close();
    }
}
