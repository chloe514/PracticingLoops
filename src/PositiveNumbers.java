import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Loop until the user enters zero
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Check if the number is zero
            if (number == 0) {
                break; // Exit the loop
            }

            // Check if the number is less than zero
            if (number < 0) {
                System.out.println("The number must be positive.");
            } else {
                // Print the positive number
                System.out.println("You entered: " + number);
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}

