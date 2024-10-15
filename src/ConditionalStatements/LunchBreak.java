package ConditionalStatements;

//        Вход
//        От конзолата се четат 3 реда:
//        1. Име на сериал – текст
//        2. Продължителност на епизод  – цяло число в диапазона [10… 90]
//        3. Продължителност на почивката  – цяло число в диапазона [10… 120]
//        Изход
//        На конзолата да се изпише един ред:
//        • Ако времето е достатъчно да изгледате епизода:
//        "You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
//        • Ако времето не Ви е достатъчно:
//        "You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."
//        Времето да се закръгли до най-близкото цяло число нагоре.


import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String filmName = scan.nextLine();
        double filmDuration = Double.parseDouble(scan.nextLine());
        double brakeDuration = Double.parseDouble(scan.nextLine());

        filmDuration = Math.max(10, Math.min(90, filmDuration));
        brakeDuration = Math.max(10, Math.min(120, brakeDuration));

        double eatingTime = brakeDuration / 8;
        double relaxTime = brakeDuration / 4;

         brakeDuration -=  (eatingTime + relaxTime + filmDuration);

        if (brakeDuration >= 0) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, Math.ceil(brakeDuration));
        } else if (brakeDuration < 0) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName, Math.ceil(Math.abs(brakeDuration)));

        }


    }
}
