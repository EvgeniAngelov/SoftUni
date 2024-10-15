package ForCycleExercice;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actor = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());  //number of judges

        for (int i = 0; i < n; i++) {
            String judge = scan.nextLine();
            double mark = Double.parseDouble(scan.nextLine());

            points += judge.length() * mark / 2;
            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.01f!", actor, points);
                break;
            }
        }
        if (1250.5 > points) {
            System.out.printf("Sorry, %s you need %.01f more!", actor, 1250.5 - points);
        }
    }
}
