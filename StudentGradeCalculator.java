import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("    STUDENT GRADE CALCULATOR");
        System.out.println("=================================");
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        while(numberOfSubjects <= 0){
            System.out.println("Invalid number of subjects!");
            System.out.print("Enter the number of subjects again: ");
            numberOfSubjects = scanner.nextInt();
        }
        int totalMarks = 0;
        for(int i = 1; i <= numberOfSubjects; i++){
            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            int marks = scanner.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks must be between 0 and 100.");
                System.out.print("Enter marks for Subject " + i + " again: ");
                marks = scanner.nextInt();
            }
            totalMarks += marks;
        }
        double averagePercentage =
                (double) totalMarks / numberOfSubjects;
        String grade;
        if(averagePercentage >= 90){
            grade = "A+";
        } 
        else if(averagePercentage >= 80){
            grade = "A";
        } 
        else if(averagePercentage >= 70){
            grade = "B";
        } 
        else if(averagePercentage >= 60){
            grade = "C";
        } 
        else if(averagePercentage >= 50){
            grade = "D";
        } 
        else{
            grade = "F";
        }
        System.out.println("\n=================================");
        System.out.println("             RESULT");
        System.out.println("=================================");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n",averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("=================================");
        
        scanner.close();
    }
}