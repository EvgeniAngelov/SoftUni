package ConditionalStatementsAdvanced;

   import java.util.Scanner;

    public class DayOfWeek {

        public static void main(String[] args) {
            // Създаваме Scanner обект за четене на потребителски вход
            Scanner scanner = new Scanner(System.in);

            // Четем цяло число от потребителя
            // System.out.print("Enter a number (1-7): ");
            int dayNumber = scanner.nextInt();

            // Извеждаме ден от седмицата или "Error", ако числото е извън границите
            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }


