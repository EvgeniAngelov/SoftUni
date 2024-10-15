package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam   {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());        // 0 <= examHour < 24, 0 <= examMinute < 60
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());       // 0 <= arrivalHour < 24, 0 <= arrivalMinute < 60
        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int difference = Math.abs(examTime - arrivalTime);
        int hours = difference / 60;
        int minutes = difference % 60;

        if (examTime < arrivalTime) {
            System.out.println("Late");
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                System.out.printf("%d:%02d hours after the start", hours, minutes);

            }

        } else if (arrivalTime <= examTime && difference <= 30) {
            System.out.println("On time");
            if (difference != 0) {
                System.out.printf("%d minutes before the start", difference);
            }

        } else if (arrivalTime < examTime && difference > 30) {
            System.out.println("Early");
            if (hours != 0) {
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", minutes);
            }
        }
    }
}

