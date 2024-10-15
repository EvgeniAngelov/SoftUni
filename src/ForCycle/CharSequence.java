package ForCycle;

import java.util.Scanner;

public class CharSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char[] chars = string.toCharArray();


        for (int i = 0; i < string.length(); i++) {
            System.out.println(chars[i]);
        }


    }
}
