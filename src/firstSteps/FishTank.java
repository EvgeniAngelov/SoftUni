package firstSteps;

//        1. Дължина в см – цяло число в интервала [10 … 500]
//        2. Широчина в см – цяло число в интервала [10 … 300]
//        3. Височина в см – цяло число в интервала [10… 200]
//        4. Процент  – реално число в интервала [0.000 … 100.000]

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double volumeSand = Double.parseDouble(scan.nextLine());

        double volumeTank = lenght*width*height*0.001;
        volumeSand = volumeTank*volumeSand/100;
        volumeTank = volumeTank-volumeSand;

        System.out.println(volumeTank);



    }
}
