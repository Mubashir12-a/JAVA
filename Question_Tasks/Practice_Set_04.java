import java.util.Scanner;

public class Practice_Set_04 {
    public static void main(String[] args) {
        /* Q.3: Write a JAVA program to find wheather a year entered by the user
                is a leap year or not?
         */

        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter The year (e.g; 2024) : ");
        int year = inpt.nextInt();


        if(year < 1000 || year > 9999){
            System.out.println("Invalid Year!");
            System.exit(0);
        }

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " a leap year!");
        }
        else {
            System.out.println(year + " not a leap year!");
        }


        /* Q.4: Write a program to find out the type of website from the URL?
                *  .com -- commercial website
                *  .org -- organization website
                *  .in  -- indian website
        */

        inpt.nextLine();

        System.out.print("Enter URL: ");
        String url = inpt.nextLine();

        inpt.close();

        if(url.endsWith(".com")){
            System.out.println("Its a Commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Its a organization website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Its a indian website");
        }
        else {
            System.out.println("Out of choices by developer!");
        }
        
    }
}
