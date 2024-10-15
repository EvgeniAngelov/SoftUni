package WhileLoopExercice;


import java.util.Scanner;


public class Cake {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        CakeSize cakeSize = new CakeSize(height, width);

        while (cakeSize.getCakePieces() > 0) {
            String input = scan.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int pieces = Integer.parseInt(input);
            cakeSize.setCakePieces(cakeSize.getCakePieces() - pieces);
        }
        if (cakeSize.getCakePieces() < 0) {
            System.out.println("No more cake left! You need " + Math.abs(cakeSize.getCakePieces()) + " pieces more.");
        } else {
            System.out.println(cakeSize.getCakePieces() + " pieces are left.");
        }
    }
}

class CakeSize {
    private int hegight = 0;
    private int width = 0;
    private int cakePieces = 0;

    public CakeSize(int hegight, int width) {
        this.hegight = hegight;
        this.width = width;
        this.cakePieces = (hegight * width);
    }

    public void setCakePieces(int cakePieces) {
        this.cakePieces = cakePieces;
    }

    public int getCakePieces() {

        return (cakePieces);

    }
}

