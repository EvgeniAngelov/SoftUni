package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;
            if (nights > 7 && nights <= 14) {
                studioPrice = 0.95 * studioPrice;
            } else if (nights > 14) {
                studioPrice = 0.7 * studioPrice;
                apartmentPrice = 0.9 * apartmentPrice;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if (nights > 14) {
                studioPrice = 0.8 * studioPrice;
                apartmentPrice = 0.9 * apartmentPrice;

            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            apartmentPrice = 77;
            if (nights > 14) {
                apartmentPrice = 0.9 * apartmentPrice;
            }
        }
        System.out.printf("Apartment: %.2f lv. %n", apartmentPrice * nights);
        System.out.printf("Studio: %.2f lv.", studioPrice * nights);
    }
}
