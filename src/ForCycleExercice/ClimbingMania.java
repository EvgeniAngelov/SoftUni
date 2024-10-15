package ForCycleExercice;

import java.util.Scanner;

public class ClimbingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = scanner.nextInt();
        int[] peopleInGroups = new int[groupsCount];

        int totalPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groupsCount; i++) {
            peopleInGroups[i] = scanner.nextInt();
            totalPeople += peopleInGroups[i];

            if (peopleInGroups[i] <= 5) {
                musala += peopleInGroups[i];
            } else if (peopleInGroups[i] <= 12) {
                monblan += peopleInGroups[i];
            } else if (peopleInGroups[i] <= 25) {
                kilimanjaro += peopleInGroups[i];
            } else if (peopleInGroups[i] <= 40) {
                k2 += peopleInGroups[i];
            } else {
                everest += peopleInGroups[i];
            }
        }

        double musalaPercentage = (double) musala / totalPeople * 100;
        double monblanPercentage = (double) monblan / totalPeople * 100;
        double kilimanjaroPercentage = (double) kilimanjaro / totalPeople * 100;
        double k2Percentage = (double) k2 / totalPeople * 100;
        double everestPercentage = (double) everest / totalPeople * 100;

        System.out.printf("%.2f%%\n", musalaPercentage);
        System.out.printf("%.2f%%\n", monblanPercentage);
        System.out.printf("%.2f%%\n", kilimanjaroPercentage);
        System.out.printf("%.2f%%\n", k2Percentage);
        System.out.printf("%.2f%%\n", everestPercentage);
    }
}