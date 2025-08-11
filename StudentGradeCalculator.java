// StudentGradeCalculator.java
// Simple program to read student marks, compute total, percentage and grade.
// Easy to understand and ready to run.

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("How many subjects? ");
        int n = sc.nextInt();

        double[] marks = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextDouble();
            // Validate basic range
            if (marks[i] < 0) marks[i] = 0;
            if (marks[i] > 100) marks[i] = 100;
            total += marks[i];
        }

        double percentage = (total / (n * 100)) * 100; // percentage out of 100
        String grade = getGrade(percentage);

        System.out.println("\n--- Result ---");
        System.out.println("Name      : " + name);
        System.out.printf("Total     : %.2f / %.2f%n", total, n * 100.0);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade     : " + grade);

        sc.close();
    }

    private static String getGrade(double pct) {
        if (pct >= 90) return "A+";
        if (pct >= 80) return "A";
        if (pct >= 70) return "B+";
        if (pct >= 60) return "B";
        if (pct >= 50) return "C";
        return "D (Needs Improvement)";
    }
}
