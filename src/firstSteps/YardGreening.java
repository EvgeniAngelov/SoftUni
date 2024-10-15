package firstSteps;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double m2 = Double.parseDouble(scan.nextLine());
        Double priceTotal = m2 * 7.61;
        Double discount = priceTotal * 0.18;
        priceTotal = priceTotal - discount;

        System.out.printf("The final price is: %.2f lv.", priceTotal );
        System.out.printf("The discount is: %.2f lv.", discount  );


    }
}
