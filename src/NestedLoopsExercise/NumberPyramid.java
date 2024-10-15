package NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int x = 1;
        outerloop:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (x<=n) System.out.print((x++) + " "); else break outerloop;
            }
            System.out.println();

        }
    }
}
