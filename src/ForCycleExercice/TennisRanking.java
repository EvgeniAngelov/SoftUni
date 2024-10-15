package ForCycleExercice;


import java.util.Scanner;

public class TennisRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = scanner.nextInt();

        int totalPoints = scanner.nextInt();
        int wonTournaments = 0;
        int totalPointsWon = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String tournamentResult = scanner.next();

            switch (tournamentResult) {
                case "W":
                    totalPoints += 2000;
                    wonTournaments++;
                    totalPointsWon += 2000;
                    break;
                case "F":
                    totalPoints += 1200;
                    totalPointsWon += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    totalPointsWon += 720;
                    break;
            }
        }

        double averagePoints = (double) totalPointsWon / tournamentsCount;
        double wonPercentage = (double) wonTournaments / tournamentsCount * 100;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePoints));
        System.out.printf("%.2f%%\n", wonPercentage);
    }
}
