package NestedLoopsLab;
import java.util.Scanner;


public class TravelDestinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String destination = scanner.nextLine();
            if (destination.equals("End")) {
                break;
            }

            double budget = scanner.nextDouble();
            scanner.nextLine(); // consume newline left-over

            double savings = 0;
            while (savings < budget) {
                double amount = scanner.nextDouble();
                scanner.nextLine(); // consume newline left-over
                savings += amount;
            }

            System.out.println("Going to " + destination + "!");
        }
    }
}
