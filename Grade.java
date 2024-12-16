package day4;
import java.util.Scanner;
public class Grade {
      
	public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter the percentage of the student: ");
        double percentage = ab.nextDouble();

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("The student's grade is: " + grade);
	}
}
