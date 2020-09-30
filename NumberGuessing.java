import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int theValue = rand.nextInt(100);


        for (int i = 9; i > -1; i--) {
            System.out.println("I have a random number chosen. a number between [1 , 100]\n" +
                    "Try to guess it!");
            int guess = sc.nextInt();
            int guessesLeft = i;
            if (guess == theValue){
                System.out.println("You guessed right!");
            }else if (guess != theValue){
                System.out.println("You have "+ guessesLeft+ " more guesses to make.");
                System.out.println("_______________________________________");
            }


        }

    }

}
