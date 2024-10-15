package ForCycle;

//    10. Четна / нечетна сума
//Да се напише програма, която чете n-на брой цели числа, подадени от потребителя и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
//        • Ако сумите са равни да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
//    • Ако сумите не са равни да се отпечат два реда: "No" и на нов ред "Diff = " + разликата.
//Разликата се изчислява по абсолютна стойност.




import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {

            numbers[i] = scanner.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            int diff = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}