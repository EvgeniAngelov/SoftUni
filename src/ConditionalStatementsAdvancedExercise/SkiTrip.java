package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double days = Double.parseDouble(scan.nextLine());
        String room = scan.nextLine();
        String feedback = scan.nextLine();
        double price = 0;
        double nights = days - 1;

        if (room.equals("room for one person")) {

            price = nights * 18;
        } else if (room.equals("apartment")) {

            if (days < 10) {
                price = 25 * nights * 0.7;
            } else if (days >= 10 && days <= 15) {
                price = 25 * nights * 0.65;
            } else if (days > 15) {
                price = 25 * nights * 0.5;
            }
        } else if (room.equals("president apartment")) {
            if (days < 10) {
                price = 35 * nights * 0.9;
            } else if (days >= 10 && days <= 15) {
                price = 35 * nights * 0.85;
            } else if (days > 15) {
                price = 35 * nights * 0.8;
            }
        } else {
            System.out.println("error");
        }

        if (feedback.equals("positive")) {
            System.out.printf("%.2f", price*1.25);
        } else if (feedback.equals("negative")) {
            System.out.printf("%.2f", price*0.9);
        }

    }
}
