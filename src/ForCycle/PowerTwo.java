package ForCycle;

import java.util.Scanner;

public class PowerTwo {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i += 2) {

            System.out.println(Math.pow(2,i));


        }
    }
}

