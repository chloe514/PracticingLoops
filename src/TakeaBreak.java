import java.util.Scanner;

public class TakeaBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        // Loop until the user enters "yes"
        while (!response.equalsIgnoreCase("yes")) {
            // Prompt the user
            System.out.print("Do you want to take a break? ");
            response = scanner.nextLine();
        }

        // Inform the user that the loop has ended
        System.out.println("You decided to take a break.");
        
        scanner.close();
    }
}
