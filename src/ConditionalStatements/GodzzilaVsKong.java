package ConditionalStatements;
//От конзолата се четат 3 реда:
//Ред 1. Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
//Ред 2. Брой на статистите – цяло число в интервала [1 … 500]
//Ред 3. Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
//Изход
//На конзолата трябва да се отпечатат два реда:
//        • Ако  парите за декора и дрехите са повече от бюджета:
//        ◦ "Not enough money!"
//        ◦ "Wingard needs {парите недостигащи за филма} leva more."
//        • Ако парите за декора и дрехите са по малко или равни на бюджета:
//        ◦ "Action!"
//        ◦ "Wingard starts filming with {останалите пари} leva left."
//Резултатът трябва да е форматиран до втория знак след десетичната запетая.

import java.text.DecimalFormat;
import java.util.Scanner;

public class GodzzilaVsKong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int actrors = Integer.parseInt(scan.nextLine());
        double costumePrix = Double.parseDouble(scan.nextLine());

        double decore = budget * 10 / 100;
        costumePrix = costumePrix * actrors;
        costumePrix = (actrors > 150) ? (costumePrix - costumePrix * 10 / 100) : (costumePrix);

        budget = budget - costumePrix - decore;
        DecimalFormat newFormat = new DecimalFormat();
        if (budget >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs( budget));
        }

    }


}

