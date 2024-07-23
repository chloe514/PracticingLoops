import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Loop until the user inputs the number 5
        while (number != 5) {
            // Prompt the user to enter a number
            System.out.print("Give a number: ");
            number = scanner.nextInt();
        }

        // Inform the user that the loop has ended
        System.out.println("You entered 5. Exiting...");

        scanner.close();
    }
}


