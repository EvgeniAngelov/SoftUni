package WhileLoopExercice;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int spaceLeft = width * length * height;
        String input = scan.nextLine();
        int boxes;

        while (true) {
            try {
                boxes = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                boxes = 0;
            }

            spaceLeft -= boxes;
            if (spaceLeft <= 0) {
                System.out.println("No more free space! You need " + Math.abs(spaceLeft) + " Cubic meters more.");
                break;
            } else if (input.equals("Done")) {
                System.out.println(spaceLeft + " Cubic meters left.");
                break;
            }
            input = scan.nextLine();
        }
    }

}
