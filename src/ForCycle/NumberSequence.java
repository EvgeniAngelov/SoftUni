package ForCycle;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n--];


        for (int i = 0; i <= n; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }
        Arrays.sort(numbers);
        System.out.printf("Max number: %d\n",  numbers[n]);
        System.out.printf("Min number: %d\n", numbers[0]);
    }
}
