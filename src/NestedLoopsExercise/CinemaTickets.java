package NestedLoopsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CinemaTickets {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Double[]> tickets = new LinkedHashMap<>();
        String movie = scan.nextLine();

        while (!movie.equals("Finish")) {

            Double[] ticketsInfo = new Double[]{0.0, 0.0, 0.0, 0.0};
            ticketsInfo[0] = Double.parseDouble(scan.nextLine());
            outerloop:
            for (int i = 1; i <= ticketsInfo[0]; i++) {
                switch (scan.nextLine()) {
                    case "student" -> ticketsInfo[1]++;
                    case "standard" -> ticketsInfo[2]++;
                    case "kid" -> ticketsInfo[3]++;
                    case "End" -> {
                        break outerloop;
                    }

                }

            }
            tickets.put(movie, ticketsInfo);
            movie = scan.nextLine();
        }

        for (Map.Entry<String, Double[]> entry : tickets.entrySet()) {

            double percentTotal = (( entry.getValue()[1] +  entry.getValue()[2] +  entry.getValue()[3]) / entry.getValue()[0]) * 100;
            System.out.printf("%s - %.2f%% full.%n", entry.getKey(), percentTotal);
        }
        double totalTickets = 0;
        double students = 0;
        double standard = 0;
        double kids = 0;

        for (Map.Entry<String, Double[]> entry : tickets.entrySet()) {

            students += (entry.getValue()[1]);
            standard += (entry.getValue()[2]);
            kids += (entry.getValue()[3]);
            totalTickets =students + standard + kids;
        }

        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (students / totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standard / totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kids / totalTickets) * 100);

    }
}