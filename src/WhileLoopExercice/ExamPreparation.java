package WhileLoopExercice;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на нужната сума за екскурзията и наличните пари
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        // Променливи за следене на броя на дните и последователните дни на харчене
        int totalDays = 0;
        int consecutiveSpendDays = 0;

        // Цикълът продължава докато не се съберат нужните пари или не минат 5 дни на харчене
        while (currentMoney < moneyNeeded && consecutiveSpendDays < 5) {
            // Четене на действието (spend/save) и съответната сума
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            totalDays++;

            if (action.equals("spend")) {
                // Ако харчи, изваждаме сумата и увеличаваме броя на последователните дни за харчене
                currentMoney -= amount;
                if (currentMoney < 0) {
                    currentMoney = 0;  // Ако сумата стане отрицателна, я задаваме на 0
                }
                consecutiveSpendDays++;
            } else if (action.equals("save")) {
                // Ако спестява, прибавяме сумата и нулираме последователните дни за харчене
                currentMoney += amount;
                consecutiveSpendDays = 0;
            }
        }

        // Проверка дали са минали 5 последователни дни на харчене
        if (consecutiveSpendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            // Ако Джеси е събрала парите
            System.out.println("You saved the money for " + totalDays + " days.");
        }
    }
}
