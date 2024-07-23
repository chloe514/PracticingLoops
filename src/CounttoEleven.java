import java.util.Scanner;

public class CounttoEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number less than 11
        System.out.print("Enter a number less than 11: ");
        int number = scanner.nextInt();

        // Check if the input is less than 11
        if (number < 11) {
            // Print numbers from the user's input up to 11
            for (int i = number; i <= 11; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("The number must be less than 11.");
        }

        scanner.close();
    }
}


