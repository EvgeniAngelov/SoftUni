package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String typeOfFigure = scan.nextLine();

        if (typeOfFigure.equals("square")) {
            double sideOfSquare = Double.parseDouble(scan.nextLine());
            double surfaceOfSquare = sideOfSquare * sideOfSquare;
            System.out.println(surfaceOfSquare);

        }
        if (typeOfFigure.equals("rectangle")) {
            double sideOfRectangle1 = Double.parseDouble(scan.nextLine());
            double sideOfRectangle2 = Double.parseDouble(scan.nextLine());
            double surfaceOfRectangle = sideOfRectangle1 * sideOfRectangle2;
            System.out.println(surfaceOfRectangle);

        }
        if (typeOfFigure.equals("circle")) {
            double rad = Double.parseDouble(scan.nextLine());
            double surfaceOfCircle = Math.PI*rad*rad;
            System.out.println(surfaceOfCircle);

        }
        if (typeOfFigure.equals("triangle")) {
            double side = Double.parseDouble(scan.nextLine());
            double hight = Double.parseDouble(scan.nextLine());
            double surfaceOfTriangle = side * hight/2;
            System.out.println(surfaceOfTriangle);

        }

    }
}




