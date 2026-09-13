import java.util.Scanner;

public class Util {
    public static Scanner scanner = new Scanner(System.in);

    public static void println(Object message) {
        System.out.println(message);
    }
    public static void print(Object message) {
        System.out.print(message);
    }

    public static String input(Object message) {
        print(message);

        String input = null;

        while (input == null) {
            input = scanner.nextLine();

            if (input == null || input.trim().isEmpty()) {
                println("Input cannot be empty. Please try again.");
                print(message);
                input = null;
            }
        }

        return input;
    }

    public static int inputInt(Object message) {
        while (true) {
            try {
                return Integer.parseInt(input(message));
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static double inputDouble(Object message) {
        while (true) {
            try {
                return Double.parseDouble(input(message));
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid double.");
            }
        }
    }

    public static boolean confirm(Object message) {
        print(message);
        String response = scanner.nextLine();
        return response == null || !response.equalsIgnoreCase("n");
    }
}

// Rene, bituin ng mindanao 🎵