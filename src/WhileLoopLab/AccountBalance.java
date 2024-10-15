package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double total = 0.0;


        String input = "";

        while (true){
            input = scan.nextLine();
            if (input.equals("NoMoreMoney")) {
                break;
            }

            if (Double.parseDouble(input) < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total += Double.parseDouble(input);
            System.out.printf("Increase: %.2f%n", Double.parseDouble(input));

        }

        System.out.printf("Total: %.2f%n", total);

    }
}
