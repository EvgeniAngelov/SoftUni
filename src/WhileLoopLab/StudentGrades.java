import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        double sumGrades = 0;
        int countGrades = 0;
        int currentClass = 1;
        int exclusions = 0;

        while (currentClass <= 12) {
            double grade = scanner.nextDouble();
            scanner.nextLine(); // consume newline left-over

            if (grade < 4.00) {
                exclusions++;

                if (exclusions > 1) {
                    System.out.printf("%s has been excluded at %d grade%n", studentName, currentClass);
                    return;
                }
            } else {
                sumGrades += grade;
                countGrades++;
                currentClass++;
            }


        }

        double averageGrade = sumGrades / countGrades;
        System.out.printf("%s graduated. Average grade: %.2f%n", studentName, averageGrade);

    }
}