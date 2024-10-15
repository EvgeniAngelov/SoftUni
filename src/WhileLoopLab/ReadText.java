package WhileLoopLab;

//Напишете програма, която чете текст от конзолата (стринг) и го принтира, докато не получи командата "Stop".

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }
    }
}
