package ConditionalStatementsAdvancedExercise;
import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double totalIncome = 0.0;
        if (projection.equals("Premiere")) {
            totalIncome = rows * columns * 12.0;
        } else if (projection.equals("Normal")) {
            totalIncome = rows * columns * 7.5;
        } else if (projection.equals("Discount")) {
            totalIncome = rows * columns * 5.0;
        }
        System.out.printf("%.2f leva", totalIncome);
    }
}
