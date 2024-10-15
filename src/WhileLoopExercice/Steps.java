package WhileLoopExercice;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {

        new Thread( ()-> {
                Scanner scanner = new Scanner(System.in);

                // Целта на Габи за деня е 10 000 стъпки
                int goal = 10000;
                int totalSteps = 0;

                while (totalSteps < goal) {
                    // Четене на вход от конзолата
                    String input = scanner.nextLine();

                    if (input.equals("Going home")) {
                        // Ако Габи иска да се прибере, четем последните стъпки и приключваме цикъла
                        int stepsGoingHome = Integer.parseInt(scanner.nextLine());
                        totalSteps += stepsGoingHome;
                        break;
                    } else {
                        // Добавяне на стъпките към общия брой
                        int steps = Integer.parseInt(input);
                        totalSteps += steps;
                    }
                }

                // Проверка дали целта е постигната
                if (totalSteps >= goal) {
                    System.out.println("Goal reached! Good job!");
                    System.out.println((totalSteps - goal) + " steps over the goal!");
                } else {
                    System.out.println((goal - totalSteps) + " more steps to reach goal.");
                }
            }

        ).start();

    }
}