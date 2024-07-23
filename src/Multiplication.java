import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the multiplication table for the given number
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

