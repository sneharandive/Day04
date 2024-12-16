package day4;
import java.util.*;
public class ArithmeticOperations {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            String result;
            switch (choice) {
                case 1:
                    result = "Result of Addition: " + (num1 + num2);
                    break;
                case 2:
                    result = "Result of Subtraction: " + (num1 - num2);
                    break;
                case 3:
                    result = "Result of Multiplication: " + (num1 * num2);
                    break;
                case 4:
                    result = num2 != 0 
                            ? "Result of Division: " + (num1 / num2) 
                            : "Error: Division by zero is not allowed.";
                    break;
                default:
                    result = "Invalid choice. Please choose a valid option.";
            }

            System.out.println(result);

        } while (choice != 5);

	}
}

	            

