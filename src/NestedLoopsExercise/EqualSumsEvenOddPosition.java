package NestedLoopsExercise;

import java.util.Scanner;
import java.util.function.Function;

public class EqualSumsEvenOddPosition {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int sumOdd = 0;
        int sumPair = 0;
        Function<Character, Integer> charToInt = c -> c - '0';
        int digitCount = String.valueOf(num1).length();

        for (int i = num1; i <= num2; i++) {

            for (int j = 0; j < digitCount; j++) {
                if (j % 2 == 0) {
                    sumPair += charToInt.apply(String.valueOf(i).charAt(j));
                } else
                    sumOdd += charToInt.apply(String.valueOf(i).charAt(j));

            }

            if (sumPair == sumOdd) {
                System.out.print(i + " ");
            }
            sumOdd = 0;
            sumPair = 0;

        }

    }
}
