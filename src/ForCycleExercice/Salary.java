package ForCycleExercice;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int openTabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        String oppenTab;


        for (int i = 1; i <= openTabs; i++) {
            oppenTab = scan.nextLine();
            switch (oppenTab) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }


        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }

    }
}
