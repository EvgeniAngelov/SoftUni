package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = scan.nextDouble();

        double price = 0;
        boolean isValid = true;



        boolean workingDayOfTheWeek = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday");
        boolean weekend = day.equals("Saturday") || day.equals("Sunday");


        switch (fruit) {
            case "banana":
                if (workingDayOfTheWeek) {
                    price = 2.50;
                } else if (weekend) {
                    price = 2.70;
                } else {
                    isValid = false;
                }
                break;
            case "apple":
                if (workingDayOfTheWeek) {
                    price = 1.20;
                } else if (weekend) {
                    price = 1.25;
                } else {
                    isValid = false;
                }
                break;
            case "orange":
                if (workingDayOfTheWeek) {
                    price = 0.85;
                } else if (weekend) {
                    price = 0.90;
                } else {
                    isValid = false;
                }
                break;
            case "grapefruit":
                if (workingDayOfTheWeek) {
                    price = 1.45;
                } else if (weekend) {
                    price = 1.60;
                } else {
                    isValid = false;
                }
                break;
            case "kiwi":
                if (workingDayOfTheWeek) {
                    price = 2.70;
                } else if (weekend) {
                    price = 3.00;
                } else {
                    isValid = false;
                }
                break;
            case "pineapple":
                if (workingDayOfTheWeek) {
                    price = 5.50;
                } else if (weekend) {
                    price = 5.60;
                } else {
                    isValid = false;
                }
                break;
            case "grapes":
                if (workingDayOfTheWeek) {
                    price = 3.85;
                } else if (weekend) {
                    price = 4.20;
                } else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
                break;
        }

        if (isValid) {
            System.out.printf("%.2f", price * quantity);
        } else {
            System.out.println("error");
        }
    }
}

