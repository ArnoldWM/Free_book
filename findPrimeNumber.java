import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int Number = number.nextInt();
        boolean Isprime = false;
        for(int i = 2; i <= Number/2; ++i) // condition 1 --> non prime numbers
        {
            if(Number % i == 0)
            {
                Isprime = true;
                break;
            }
        }
        if (!Isprime)
            System.out.println(Number + " is a prime number.");
        else
            System.out.println(Number + " is not a prime number.");
    }
}

