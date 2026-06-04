
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //created scanner for user input
        Scanner scanner = new Scanner(System.in);

        //for loop condition
        boolean stayOnCalc = true;

        //while loop start
        while (stayOnCalc) {
            //final result initialization
            int result = 0;

            //user inputs
            System.out.print("Input first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Input second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Indicate what operation would you like(input +,-,*,/ only): ");
            char operator = scanner.next().charAt(0);

            //operations
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else {
                System.out.println("Invalid operator. Please try again.");
            }

            //print result
            System.out.println("The result is: " + result);

            //program asks if user wants to continue
            System.out.print("Continue? (Y / N): ");
            char userResponse = scanner.next().charAt(0);

            //if user prints N, while loop breaks
            if (userResponse == 'N' || userResponse == 'n') {
                System.out.println("Thanks for trying.");
                break;
            }
        }

    }
}
