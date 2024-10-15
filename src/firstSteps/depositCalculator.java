package firstSteps;

import java.util.Scanner;

public class depositCalculator {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.print("Депозит:");
            double deposit = Double.parseDouble(scanner.nextLine());
            System.out.print("Период:");
            int period = Integer.parseInt(scanner.nextLine());
            System.out.print("Лихва:");
            double rate = Double.parseDouble(scanner.nextLine());

            double ratePerMonth = (deposit * (rate / 100)) / 12;
            double result = deposit + (period * ratePerMonth);

            System.out.println(result);

   }
}
