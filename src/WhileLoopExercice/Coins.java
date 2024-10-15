package WhileLoopExercice;


import java.util.HashMap;
import java.util.Scanner;

public class Coins {


    static double coinsChange(double amount) {

        final double[][] coins = {
                {2.0, 0},
                {1.0, 0},
                {0.5, 0},
                {0.2, 0},
                {0.1, 0},
                {0.05, 0},
                {0.02, 0},
                {0.01, 0}
        };
        double result = 0;

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i][0]) {
                amount -= coins[i][0];
                amount = Math.round(amount * 100) / 100.0;
                if (amount >= 0) {
                    ++coins[i][1];
                }
            }
        }

        for (int i = 0; i < coins.length; i++) {

            result += coins[i][1];
        }


        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount = Double.parseDouble(scan.nextLine());


        System.out.printf("%.0f", coinsChange(amount));
    }


}
