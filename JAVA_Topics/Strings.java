import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        
        String name = "Mubashir";
        // String is class.
        // String is a sequence of characters.
        // String is Non-primitive data-type but also used as primitive data-type.
        // Strings are immutable and can't be changed.

        System.out.println(name);




        // Different ways to print in java:

        // This is used when a new line is required.
        System.out.println("Line-1");
        System.out.println("Line-1");

        // This is used when new line is not required.
        System.out.print("Line-2");
        System.out.print("Line-2");

        // This works same as In C language (format specifiers):
        System.out.println();
        System.out.printf("Name is : %s", name);



        /////////////////////////////////////////////////

        Scanner inpt = new Scanner(System.in);

        System.out.println();
        String st_OneWord = inpt.next();
        System.out.println(st_OneWord);

        inpt.nextLine();

        String st_AllWorlds = inpt.nextLine();
        System.out.println(st_AllWorlds);

        inpt.close();

    }
}
