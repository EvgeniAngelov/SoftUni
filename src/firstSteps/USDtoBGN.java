package firstSteps;

import java.util.Scanner;

//Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN).
// Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.

public class USDtoBGN {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double USD = Double.parseDouble(scan.nextLine());
        System.out.println(USD*1.79549);

    }
}
