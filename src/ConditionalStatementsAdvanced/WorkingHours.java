package ConditionalStatementsAdvanced;


import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hour = scanner.nextInt();
        scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        boolean isOfficeOpen = (hour >= 10 && hour <= 18) &&
                (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
                        dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday"));

        if (isOfficeOpen) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}


