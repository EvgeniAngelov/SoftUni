package WhileLoopLab;

import java.util.Scanner;

public class Sequence2k1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        int current = 1;
        while (current <= n) {
            System.out.println(current );
            current = current * 2 + 1;
        }
    }
}
