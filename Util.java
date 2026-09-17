/*
 * This is a utility class that provides methods for user input and output.
 * This class is used to abstract away the details of reading input from the console and printing output to the console.
 */

import java.util.Scanner;

public class Util {
    // A Scanner object to read user input from the console
    public static Scanner scanner = new Scanner(System.in);

    // A method to print a message to the console
    public static void println(Object message) {
        System.out.println(message);
    }

    // A method to print a message to the console without a newline
    public static void print(Object message) {
        System.out.print(message);
    }

    // A method to read a line of input from the user and return it as a String.
    // If the input is empty, it will prompt the user to enter a valid input.
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

    // A method to read an integer input from the user and return it as an int.
    // If the input is not a valid integer, it will prompt the user to enter a valid integer.
    public static int inputInt(Object message) {
        while (true) {
            try {
                return Integer.parseInt(input(message));
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    // A method to read a double input from the user and return it as a double.
    // If the input is not a valid double, it will prompt the user to enter a valid double.
    public static double inputDouble(Object message) {
        while (true) {
            try {
                return Double.parseDouble(input(message));
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a valid double.");
            }
        }
    }

    // A method to read a (Y/n) input from the user and return it as a boolean.
    // If the input is not a valid (Y/n) input, it will default and return true (Y).
    public static boolean confirm(Object message) {
        print(message);
        String response = scanner.nextLine();
        return response == null || !response.equalsIgnoreCase("n");
    }
}