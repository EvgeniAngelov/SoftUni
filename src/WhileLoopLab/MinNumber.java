package WhileLoopLab;

import java.util.Scanner;

public class MinNumber  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (true) {
            String input = scanner.nextLine();
            if ("Stop".equals(input)) {
                break;
            }
            int number = Integer.parseInt(input);
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
