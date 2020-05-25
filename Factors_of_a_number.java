mport java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);
        int number = Number.nextInt();

        System.out.print("The Factors of " + number + " are: ");
        for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
