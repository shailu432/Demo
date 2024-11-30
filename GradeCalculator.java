import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int totalSubjects = scanner.nextInt();
        
        // Create an array to store marks for each subject
        int[] marks = new int[totalSubjects];

        // Input marks for each subject
        System.out.println("Enter marks for each subject (out of 100): ");
        int totalMarks = 0;
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];  // Sum up the total marks
        }

        // Calculate average percentage
        double averagePercentage = ((double) totalMarks / (totalSubjects * 100)) * 100;

        // Grade Calculation based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else if (averagePercentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
