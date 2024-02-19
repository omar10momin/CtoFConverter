import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0; // Initialize celsius to 0
        boolean validInput = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        in.close();
    }
}
