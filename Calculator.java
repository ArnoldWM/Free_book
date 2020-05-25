import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        int a, b, result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (addition, division , subtraction, modulo or multiplication): ");

        operator = scanner.next().charAt(0);
        System.out.print("Enter two numbers: ");

        a = scanner.nextInt();
        b = scanner.nextInt();

        switch (operator) {
            case '+':
                result = a + b;
                System.out.print(a + "+" + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.print(a + "-" + b + " = " + result);
                break;

            case '*':
                result = a * b;
                System.out.print(a + "*" + b + " = " + result);
                break;

            case '/':
                result = a / b;
                System.out.print(a + "/" + b + " = " + result);
                break;
            case '%':
                result = a / b;
                System.out.print(a + "%" + b + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
