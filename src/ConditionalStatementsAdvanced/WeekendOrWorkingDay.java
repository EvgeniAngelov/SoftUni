package ConditionalStatementsAdvanced;
import java.util.Scanner;
public class WeekendOrWorkingDay {




    public static void main(String[] args) {
        // Създаваме Scanner обект за четене на потребителски вход
        Scanner scanner = new Scanner(System.in);

        // Четем ден от седмицата от потребителя
       // System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine();

        // Преобразуваме текста към малки букви, за да избегнем проблеми с главни/малки букви
        day = day.toLowerCase();

        // Проверка кой ден е въведен
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Working day");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}


