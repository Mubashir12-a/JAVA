import java.util.Scanner;

public class Practice_Set_02 {
    public static void main(String[] args) {
        /* Q.1: Write a program to find out wheather a student is pass or fail; if it requires a total
                of 40% and at least 33% in each subject to pass. Assume 3 Subjects and take marks as 
                input from the user? */

        Scanner inpt = new Scanner(System.in);

        int Math, Eng, Phy, Chem;

        System.out.print("Enter The Student Name: ");
        String Name = inpt.nextLine();

        System.out.println("Enter Marks Of Each Subject Out of 100");

        System.out.print("Enter Marks of Math's : ");
        Math = inpt.nextByte();

        System.out.print("Enter Marks of English : ");
        Eng = inpt.nextInt();
        
        System.out.print("Enter Marks of Physics : ");
        Phy = inpt.nextInt();
        
        System.out.print("Enter Marks of Chemistry : ");
        Chem = inpt.nextInt();


        if (Math > 100 || Math < 0 || Eng > 100 || Eng < 0 || Phy > 100 || Phy < 0 || Chem > 100 || Chem < 0 ){
            System.out.println("WARNING: Invalid Marks Out of Range");
        }

        inpt.close();

        int percentage = ((Math + Eng + Phy + Chem) * 100) / 400;
        byte count = 0;

        if (Math < 33) {
            System.out.println("Fail In Maths!");
            count--;
        }
        if (Eng < 33) {
            System.out.println("Fail In English!");
            count--;
        }
        if (Phy < 33) {
            System.out.println("Fail In Physics!");
            count--;
        }
        if (Chem < 33) {
            System.out.println("Fail In Chemistry");
            count--;
        }


        System.out.println("Total Percentage in 4 subjects : " + percentage + "%");

        if(count == 4){
            System.out.println(Name + " Passed!");
        }
        else {
            System.out.println(Name + " Failed!");
        }
    }
}
