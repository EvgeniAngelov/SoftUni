package ForCycle;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(scan.nextLine());

        }
        System.out.println(result);
    }
}
