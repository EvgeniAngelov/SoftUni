package ConditionalStatements;
//        Вход
//        От конзолата се четат 3 реда:
//        1. Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
//        2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
//        3. Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
//        Изход
//        Отпечатването на конзолата зависи от резултата:
//        • Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
//        ◦ "Yes, he succeeded! The new world record is {времето на Иван} seconds."
//        • Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
//        ◦ "No, he failed! He was {недостигащите секунди} seconds slower."
//        Резултатът трябва да се форматира до втория знак след десетичната запетая.


import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double recordTime = Double.parseDouble(scan.nextLine());
        double distanceMeters = Double.parseDouble(scan.nextLine());
        double timeForOneMeter = Double.parseDouble(scan.nextLine());

        // съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.

        double retard = Math.floor(distanceMeters/15)  * 12.5;

        double timeFinal = distanceMeters * timeForOneMeter + retard;


        if (timeFinal < recordTime) {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeFinal);
        } else if (timeFinal >= recordTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeFinal - recordTime);
        }


    }
}
