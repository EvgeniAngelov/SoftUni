package NestedLoopsLab;

import java.util.Scanner;

public class Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floor; i > 0; i--) {
            if (i == floor) {
                for (int j = 0; j < rooms; j++) {
                    System.out.printf("L%d%d ", i, j);
                }
            } else if (i % 2 == 0) {
                for (int j = 0; j < rooms; j++) {
                    System.out.printf("O%d%d ", i, j);
                }
            } else {
                for (int j = 0; j < rooms; j++) {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }

    }
}
