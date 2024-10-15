package WhileLoopLab;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (true) {
            String input = scanner.nextLine();
            if ("Stop".equals(input)) {
                break;
            }
            int number = Integer.parseInt(input);
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
