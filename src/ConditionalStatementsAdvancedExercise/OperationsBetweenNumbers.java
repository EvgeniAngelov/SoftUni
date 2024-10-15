package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;



public class OperationsBetweenNumbers {

  static   String evenOrOdd(double number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        String operation = scan.nextLine();
        double result = 0;
        if (b==0 && (operation.equals("/") ||  operation.equals("%"))) {
            System.out.println("Cannot divide " + (int)a + " by zero");
            return;
        }
        if (operation.equals("*")) {
            result = a * b;
            System.out.printf("%.0f * %.0f = %.0f - %s", a, b, result, evenOrOdd(result));
        } else if (operation.equals("/")) {
            result = a / b;
            System.out.printf("%.0f / %.0f = %.2f", a, b, result);
        } else if (operation.equals("+")) {
            result = a + b;
            System.out.printf("%.0f + %.0f = %.0f - %s", a, b, result, evenOrOdd(result));
        } else if (operation.equals("-")) {
            result = a - b;
            System.out.printf("%.0f - %.0f = %.0f - %s", a, b, result, evenOrOdd(result));
        } else if (operation.equals("%")) {
            result = a % b;
            System.out.printf("%.0f %% %.0f = %.0f", a, b, result);
        }
    }



}

