package ConditionalStatements;

//Да се напише програма, която чете час и минути от 24-часово денонощие,
// въведени от потребителя и изчислява колко ще е часът след 15 минути.
// Резултатът да се отпечата във формат часове:минути. Часовете винаги са между 0 и 23,
// а минутите винаги са между 0 и 59. Часовете се изписват с една или две цифри.
// Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.

import java.util.Scanner;

public class TimePlus15Minutes {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes+15;

        hour = (minutes>=60)?(hour+1):(hour);
        hour = (hour>=24)?(hour-24):(hour);

        minutes = (minutes>=60)?(minutes-60):(minutes);
        System.out.printf("%d:%02d", hour, minutes);

    }

}
