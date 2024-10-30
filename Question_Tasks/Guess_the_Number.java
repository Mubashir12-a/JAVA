
/**
 * InnerGuess_the_Number
 */

/*
 * Task: Create a class Game, which allows a user to play "Guess the Number" game once. 
 * Game should have the following methods:
 * 
 * 1. TakeUserInput to take a user input of number.
 * 2. isCorrectNumber to detect whether the number entered by the user is true.
 * 3. Use properties such as noOfGuess, etc to get this task done.
 * 4. getter and setters for noOfGuesses.
 */

import java.util.Scanner;
import java.util.Random;

class Game {

    private int userNum;
    private int randomNumber;
    private boolean flag = false;
    private int count = 0;

    public void getInstruction() {
        System.out.print("Guess the Number from 1 to 100 : ");
    }

    public void setNum(int n) {
        if (n > 0 && n <= 100) {
            this.userNum = n;
        } else {
            System.out.println("Something went wrong please try again...");
            System.exit(0);
        }
    }

    public int getNum() {
        return userNum;
    }

    public void setRandomNumber(int n) {
        this.randomNumber = n;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    // logic for winning:

    public void check() {
        if (this.userNum == this.randomNumber) {
            System.out.println("You Won");
            this.flag = true;
        } else if (this.userNum < this.randomNumber) {
            System.out.println("Random Number is bigger.");
            this.flag = false;
        } else if (this.userNum > this.randomNumber) {
            System.out.println("Random Number is smaller.");
            this.flag = false;
        } else {
            // Nothing
        }
    }

    public boolean retry() {
        return flag;
    }

    public void tries() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}

public class Guess_the_Number {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        Random random = new Random();
        Game player = new Game();

        player.setRandomNumber(random.nextInt(100) + 1);

        while (player.retry() != true) {
            player.getInstruction();
            player.setNum(inpt.nextInt());
            player.check();
            player.tries();
        }

        System.out.println("User Number : " + player.getNum());
        System.out.println("Random Number : " + player.getRandomNumber());
        System.out.println("Attempts = " + player.getCount());

        inpt.close();
    }
}
