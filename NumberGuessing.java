import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int theValue = (int) (Math.random() * 100) + 1;


        for (int i = 9; i > -1; i--) {
            System.out.println("I have a random number chosen. a number between [1 , 100]\n" +
                    "Try to guess it!");
            int guess = sc.nextInt();
            int guessesLeft = i;
            if (guess == theValue) {
                System.out.println("You guessed right!");
                i = -1;
            } else {
                System.out.println("You have " + guessesLeft + " more guesses to make.");
                if (theValue > guess) {
                    int close = guess - theValue;
                    System.out.println("Your guess is " + close + " lower ");
                } else if (theValue < guess) {
                    int far = theValue + guess;
                    System.out.println("Your guess is " + far + " higher ");
                }
                System.out.println("_______________________________________");
                //System.out.println(theValue);

            }


        }

    }

}
