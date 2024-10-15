package ForCycleExercice;

import java.util.Scanner;

public class CleverLily {


    Scanner scan = new Scanner(System.in);
  private   int age = Integer.parseInt(scan.nextLine());
  private   double price = Double.parseDouble(scan.nextLine());
  private   int toyPrice = Integer.parseInt(scan.nextLine());
  private   int numberOfToys = 0;
  private   int numberOfEvenBirthDays = 0;
  private   int savings = 0;


    public void Savings() {

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                ++numberOfToys;
            } else {
                ++numberOfEvenBirthDays;
                savings += 10 * numberOfEvenBirthDays;
                --savings;
            }
        }
        toyPrice = numberOfToys * toyPrice;
    }

    public void FinalBudget() {
        price-=(savings+toyPrice);

        if (price <= 0) {
            System.out.printf("Yes! %.2f", Math.abs(price));
        } else {
            System.out.printf("No! %.2f", Math.abs(price));
        }
    }


    public static void main(String[] args) {
        CleverLily cleverLily = new CleverLily();
        cleverLily.Savings();
        cleverLily.FinalBudget();


    }


}
