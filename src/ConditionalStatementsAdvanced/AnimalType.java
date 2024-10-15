package ConditionalStatementsAdvanced;


import java.util.Scanner;


public class AnimalType {



        public static void main(String[] args) {
            // Създаваме скенер за въвеждане на данни от потребителя
            Scanner scanner = new Scanner(System.in);






            // Подканяме потребителя да въведе име на животно

            String animal = scanner.nextLine().toLowerCase(); // Превръщаме входа в малки букви

            // Проверяваме какво е животното и отпечатваме класа му
            switch (animal) {
                case "dog":
                    System.out.println("mammal");
                    break;
                case "crocodile":
                case "tortoise":
                case "snake":
                    System.out.println("reptile");
                    break;
                default:
                    System.out.println("unknown");
            }

            // Затваряме скенера
            scanner.close();
        }
    }


