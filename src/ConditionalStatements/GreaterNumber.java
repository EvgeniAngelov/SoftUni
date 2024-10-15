package ConditionalStatements;

import java.util.Scanner;

public class GreaterNumber {

static class CompareInt {

    static int grater(int x, int y) {

        if (x > y) {
            return x;

        } else return y;
    }
}



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println(CompareInt.grater(num1,num2));

    }
}
