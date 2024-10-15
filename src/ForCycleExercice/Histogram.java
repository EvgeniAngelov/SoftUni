package ForCycleExercice;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];
        int[] p = new int[]{0, 0, 0, 0, 0};

        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 200) {
                ++p[0];
            } else if (numbers[i] < 400) {
                ++p[1];
            } else if (numbers[i] < 600) {
                ++p[2];
            } else if (numbers[i] < 800) {
                ++p[3];
            } else {
                ++p[4];
            }
        }
            for (int j = 0; j < 5; j++) {

                System.out.printf("%.02f%%\n", (double)p[j]/n*100);

            }


        }

    }

