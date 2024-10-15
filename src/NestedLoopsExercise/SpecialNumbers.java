package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        boolean isSpecial = false;

        for (int i = 1111; i <= 9999; i++) {
            int lastDigit = i;
            for (int j = 1; j <= 4; j++) {
                isSpecial = true;
                int lastDigitSuffix = lastDigit % 10;
                lastDigit /= 10;
                if (lastDigitSuffix == 0) {
                    isSpecial = false;
                    break;
                } else if (!(n % lastDigitSuffix == 0)) {
                    isSpecial = false;
                    break;
                }

            }
            if (isSpecial) {
                System.out.print(i + " ");
            }
            isSpecial = false;


        }
    }

}
