package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());
        int combinations = 0;
        boolean found = false;
        outerloop:
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                if (i + j == sum) {
                    combinations++;
                    System.out.println("Combination N:" + combinations + " (" + i + " + " + j + " = " + sum + ")");
                    found = true;

                    break outerloop;
                }
                combinations++;
            }
        }

        if (!found) {

            System.out.printf("%d combinations - neither equals %d", combinations, sum);


        }
    }
}