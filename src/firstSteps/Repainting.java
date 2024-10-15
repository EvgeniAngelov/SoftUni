package firstSteps;

//        1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
//        2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
//        3. Количество разредител (в литри) - цяло число в интервала [1…30]
//        4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]


import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int protectionFlour = Integer.parseInt(scan.nextLine());
        int peinture = Integer.parseInt(scan.nextLine());
        int diluant = Integer.parseInt(scan.nextLine());
        int time = Integer.parseInt(scan.nextLine());

        double facture = (protectionFlour+2)*1.5 + peinture*1.1*14.5 +diluant*5 + 0.4;

        facture = facture + facture*0.3*time;
        System.out.println(facture);






    }
}

