import java.util.Scanner;

public class WelcomeProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a welcome message
        System.out.println("Welcome, " + name + "! Hope you have a great day. 😊");

        // Close the scanner
        scanner.close();
    }
}