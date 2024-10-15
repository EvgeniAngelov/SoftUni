package NestedLoopsExercise;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Double> students = new LinkedHashMap<>();

        int numGrades = Integer.parseInt(scan.nextLine());


        do {
            double sumGrades = 0;
            String name = scan.nextLine();
            if (name.equals("Finish")) {
                break;
            }

            for (int i = 0; i < numGrades; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                sumGrades += grade;

            }
            students.put(name, sumGrades / numGrades);
        } while (true);


        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.printf("%s - %.2f.%n", entry.getKey(), entry.getValue());
        }
        double sum = 0;
        for (Double value : students.values()) {
            sum += value;
        }
        System.out.printf("Student's final assessment is %.2f.%n", sum / students.size());

    }
}

