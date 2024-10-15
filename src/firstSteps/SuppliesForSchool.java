package firstSteps;

//Вход
//От конзолата се четат 4 числа:
//        • Брой пакети химикали - цяло число в интервала [0...100]
//        • Брой пакети маркери - цяло число в интервала [0...100]
//        • Литри препарат за почистване на дъска - цяло число в интервала [0…50]
//        • Процент намаление - цяло число в интервала [0...100]
//        • Пакет химикали - 5.80 лв.
//        • Пакет маркери - 7.20 лв.
//        • Препарат - 1.20 лв (за литър)
//Изход
//Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int stylos = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int savon = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double facture = (stylos*5.80 + markers*7.20 + savon*1.20)*(100-discount)/100;

        System.out.println(facture);



    }
}
