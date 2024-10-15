package firstSteps;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        double sum = (a*2.5)+ (b*4);
        System.out.println(sum + " lv.");

    }
}
