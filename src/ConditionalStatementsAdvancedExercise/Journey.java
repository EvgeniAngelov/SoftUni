package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String place = "";
        double price = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                price = budget * 0.30;
            } else if (season.equals("winter")) {
                place = "Hotel";
                price = budget * 0.70;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                price = budget * 0.40;
            } else if (season.equals("winter")) {
                place = "Hotel";
                price = budget * 0.80;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            if (season.equals("summer")) {
                place = "Hotel";
                price = budget * 0.90;
            } else if (season.equals("winter")) {
                place = "Hotel";
                price = budget * 0.90;
            }
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", place, price);

    }
}
