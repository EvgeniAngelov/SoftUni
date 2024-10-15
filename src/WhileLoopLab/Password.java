package WhileLoopLab;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        while (!password.equals(scanner.nextLine())) {


        }
        System.out.println("Welcome " + username + "!");
    }
}
