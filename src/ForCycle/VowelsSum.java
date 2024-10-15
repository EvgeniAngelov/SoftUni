package ForCycle;

import java.util.Scanner;


public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int result = 0;

        for (int i = 0; i < string.length(); i++) {

            switch (string.charAt(i)) {
                case 'a' -> result += 1;
                case 'e' -> result += 2;
                case 'i' -> result += 3;
                case 'o' -> result += 4;
                case 'u' -> result += 5;
            }
        }
        System.out.println(result);


    }


}

