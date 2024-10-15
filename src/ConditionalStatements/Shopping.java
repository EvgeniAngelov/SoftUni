package ConditionalStatements;

//        Вход
//        Входът се състои от четири реда:
//        1. Бюджетът на Петър - реално число в интервала [0.0…100000.0]
//        2. Броят видеокарти - цяло число в интервала [0…100]
//        3. Броят процесори - цяло число в интервала [0…100]
//        4. Броят рам памет - цяло число в интервала [0…100]
//        Изход
//        На конзолата се отпечатва 1 ред, който трябва да изглежда по следния начин:
//        • Ако бюджета е достатъчен:
//        "You have {остатъчен бюджет} leva left!"
//        • Ако сумата надхвърля бюджета:
//        "Not enough money! You need {нужна сума} leva more!"
//        Резултатът да се форматира до втория знак след десетичната запетая.
//

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double  videoCards = Double.parseDouble(scan.nextLine());
        double proccesors =Double.parseDouble(scan.nextLine());
        double ram = Double.parseDouble(scan.nextLine());

        int discount = (videoCards > proccesors) ? (15) : (0);


        videoCards = videoCards * 250;
        proccesors = proccesors *( videoCards * 35 / 100);
        ram = ram * (videoCards * 10 / 100);

        double priceFinal = (videoCards + proccesors + ram);
        priceFinal -= priceFinal * discount / 100;


        if (priceFinal <= budget) {
            System.out.printf("You have %.02f leva left!", budget - priceFinal);
        } else if (priceFinal > budget) {
            System.out.printf("Not enough money! You need %.02f leva more!", priceFinal - budget);

        }

    }


}