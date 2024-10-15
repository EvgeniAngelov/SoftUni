package WhileLoopExercice;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входа - максимален брой незадоволителни оценки
        int maxUnsatisfactoryGrades = Integer.parseInt(scanner.nextLine());

        // Помощни променливи
        int unsatisfactoryCount = 0;  // брояч за незадоволителни оценки
        int problemCount = 0;         // брояч за решените задачи
        double gradeSum = 0;          // сума на всички оценки
        String lastProblem = "";      // последната задача
        boolean failed = false;       // дали Марин се е провалил

        // Започваме цикъл за въвеждане на задачите и оценките
        while (unsatisfactoryCount < maxUnsatisfactoryGrades) {
            String problemName = scanner.nextLine();

            // Ако командата е "Enough", приключваме цикъла
            if (problemName.equals("Enough")) {
                failed = true;
                break;
            }

            // Четене на оценката за текущата задача
            int grade = Integer.parseInt(scanner.nextLine());

            // Увеличаваме брояча за задачи и прибавяме оценката към общата сума
            problemCount++;
            gradeSum += grade;
            lastProblem = problemName;  // запазваме името на последната задача

            // Проверка дали оценката е незадоволителна (<= 4)
            if (grade <= 4) {
                unsatisfactoryCount++;
            }
        }

        // Изход според резултата
        if (unsatisfactoryCount == maxUnsatisfactoryGrades) {
            // Ако е достигнат лимитът на незадоволителни оценки
            System.out.println("You need a break, " + unsatisfactoryCount + " poor grades.");
        } else if (failed) {
            // Ако командата "Enough" е била въведена и Марин е спрял преди да се провали
            System.out.printf("Average score: %.2f%n", gradeSum / problemCount);
            System.out.println("Number of problems: " + problemCount);
            System.out.println("Last problem: " + lastProblem);
        }
    }
}

