package ConditionalStatements;


//    1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
//        2. Брой пъзели - цяло число в интервала [0… 1000]
//        3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
//        4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
//        5. Брой миньони - цяло число в интервала [0 … 1000]
//        6. Брой камиончета - цяло число в интервала [0 … 1000]
//    • Ако парите са достатъчни се отпечатва:
//        ◦ "Yes! {оставащите пари} lv left."
//        • Ако парите НЕ са достатъчни се отпечатва:
//        ◦ "Not enough money! {недостигащите пари} lv needed."


import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scan.nextLine());
        int pazels = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        int discount = (pazels + dolls + bears + minions + trucks) >= 50 ? (25) : (0);

        double earningTotal = pazels * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        earningTotal= earningTotal-earningTotal*discount/100;
        earningTotal = earningTotal*90/100;

        double moneyLeft = earningTotal-excursionPrice;




        if (earningTotal>=excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else{
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));
        }




    }
}
