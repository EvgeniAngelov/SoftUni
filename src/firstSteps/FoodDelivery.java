package firstSteps;
//Ресторант отваря врати и предлага няколко менюта на преференциални цени:
//    • Пилешко меню –  10.35 лв.
//    • Меню с риба – 12.40 лв.
//    • Вегетарианско меню  – 8.15 лв.
//        Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
//Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
//Цената на доставка е 2.50 лв и се начислява най-накрая.
//        Вход
//От конзолата се четат 3 реда:
//        • Брой пилешки менюта – цяло число в интервала [0 … 99]
//        • Брой менюта с риба – цяло число в интервала [0 … 99]
//        • Брой вегетариански менюта – цяло число в интервала [0 … 99]

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scan.nextLine());
        int fishMenu     = Integer.parseInt(scan.nextLine());
        int veganMenu = Integer.parseInt(scan.nextLine());

        double totalPrice =  chickenMenu*10.35 + fishMenu*12.40 + veganMenu*8.15;
        double desert = totalPrice*0.2;
        System.out.println(totalPrice+desert+2.5);


    }
}
