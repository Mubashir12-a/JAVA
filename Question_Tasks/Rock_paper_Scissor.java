import java.util.Scanner;
import java.util.Random;

public class Rock_paper_Scissor {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Rock --> (0)\nPaper --> (1)\nScissor --> (2)");
        System.err.println("Enter character given {0, 1, 2} only else it create error!");

        char Y_N = 'Y';
        int point_user = 0;
        int point_comp = 0;

        do {
            System.out.print("Enter Your Choice : ");
            byte user = inpt.nextByte();

            System.out.println("\n");

            int computer = rnd.nextInt(3);
            String icon_comp = " ";
            String icon_user = " ";

            if (user == 0 || user == 1 || user == 2) {
                if (computer == 0) {
                    icon_comp = "Rock";
                }
                if (computer == 1) {
                    icon_comp = "Paper";
                }
                if (computer == 2) {
                    icon_comp = "Scissor";
                }
                if (user == 0) {
                    icon_user = "Rock";
                }
                if (user == 1) {
                    icon_user = "Paper";
                }
                if (user == 2) {
                    icon_user = "Scissor";
                }
            } else {
                System.out.println("Invalid input! (enter 0, 1 , or 2 ) --- New game...");
                continue;
            }

            System.out.println("User Choice : " + user + " that is --> " + icon_user);
            System.out.println("Computer Choice : " + computer + " that is --> " + icon_comp);

            if (user == computer) {
                System.out.println("Draw");
            }

            if (user != computer) {
                if (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
                    System.out.println("computer wins (" + icon_comp + ") beats (" + icon_user + ")");
                    point_comp += 100;
                } else {
                    System.out.println("User wins (" + icon_user + ") beats (" + icon_comp + ")");
                    point_user += 100;
                }
            }

            System.out.println("\n");

            System.out.print("Do You Want try again (Y/N): ");
            Y_N = inpt.next().charAt(0);

            System.out.println("\n");

        } while (Y_N == 'Y' || Y_N == 'y');

        System.out.println("Your Score : " + point_user + "\nComputer Score : " + point_comp);

        inpt.close();
    }
}
