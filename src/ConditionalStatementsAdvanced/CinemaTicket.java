package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CinemaTicket {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine().trim();

        int ticketPrice=0;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                ticketPrice = 12;
                break;
            case "Wednesday":
            case "Thursday":
                ticketPrice = 14;
                break;
            case "Saturday":
            case "Sunday":
                ticketPrice = 16;
                break;

        }

            System.out.println(ticketPrice);

    }
}
