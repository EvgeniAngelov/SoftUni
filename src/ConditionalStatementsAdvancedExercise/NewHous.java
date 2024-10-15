package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHous {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fleur = scan.nextLine();
        Integer countFleurs = Integer.parseInt(scan.nextLine());
        Integer budget = Integer.parseInt(scan.nextLine());
        double discount = 1, totalPrice = 0;

        switch (fleur) {
            case "Roses":
                if (countFleurs > 80) {
                    discount = 0.90;
                }
                totalPrice=countFleurs*5*discount;
                break;
            case "Dahlias":
                if (countFleurs > 90) {
                    discount =  0.85;
                }
                totalPrice=countFleurs*3.8*discount;
                break;
            case "Tulips":
                if (countFleurs > 80) {
                    discount =  0.85;
                }
                totalPrice=countFleurs*2.8*discount;
                break;
            case "Narcissus":
                if (countFleurs < 120) {
                    discount =  1.15;
                }
                totalPrice=countFleurs*3*discount;
                break;
            case "Gladiolus":
                if (countFleurs < 80) {
                    discount =  1.20;
                }
                totalPrice=countFleurs*2.5*discount;
                break;
        }

        if (budget >= totalPrice ) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFleurs, fleur, budget - totalPrice );
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice  - budget);
        }

    }
}
