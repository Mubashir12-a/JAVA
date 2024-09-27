import java.util.Scanner;

public class Calculate_Marks {
    public static void main(String[] args) {
        int MH, SC, SS, UR, EN, Max;

        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter Max Marks/Subject: ");
        Max = inpt.nextInt();

        System.out.println("Enter marks of these subjects:");

        System.out.print("MH : ");
        MH = inpt.nextInt();
        System.out.print("SC : ");
        SC = inpt.nextInt();
        System.out.print("SS : ");
        SS = inpt.nextInt();
        System.out.print("UR : ");
        UR = inpt.nextInt();
        System.out.print("EN : ");
        EN = inpt.nextInt();

        int total_Mrks = MH + SS + SC + UR + EN;
        int Percent = (total_Mrks * 100 ) / (Max * 5);

        System.out.println("Total marks obtained: " + total_Mrks + " out of " + (Max * 5));
        System.out.println("Percentage : " + Percent + "%");

        inpt.close();
    }
}