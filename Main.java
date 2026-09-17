/*
 * This is the main class of the program.
 */

import java.util.ArrayList;

public class Main {
    // An arrayList to store the created products
    public static ArrayList<Android> androids = new ArrayList<>();
    public static ArrayList<IPhone> iPhones = new ArrayList<>();
    public static ArrayList<Laptop> laptops = new ArrayList<>();

    // The main method to run the program
    public static void main(String[] args) {
        // A loop to continuously prompt the user for input until they choose to exit
        while (true) {
            // Prompt the user for input and convert it to lowercase and trim any whitespace
            String choice = Util.input("(create, list, exit) >>> ").toLowerCase().trim();

            switch (choice) {
                case "create":
                    // Call the createProduct method to create a new product
                    createProduct();
                    break;
                case "list":
                    // Call the displayProducts method to display the list of created products
                    displayProducts();
                    break;
                case "exit":
                    // Exit the program
                    System.exit(0);
                    break;
                default:
                    // If the user enters an invalid choice, print an error message and prompt them again
                    Util.println("Invalid choice. Please try again.");
            }
        }
    }

    // A method to create a new product based on user input
    public static void createProduct() {
        boolean hasMobileData = Util.confirm("Does your product use mobile data (Y/n): ");

        // If the product uses mobile data, prompt the user to choose between creating an iPhone or an Android device. If not, create a Laptop device.
        if (hasMobileData) {
            boolean hasAirDrop = Util.confirm("Are you sharing files between Apple devices (Y/n): ");

            // If the product has AirDrop, create an iPhone device. If not, create an Android device.
            if (hasAirDrop) {
                iPhones.add(new IPhone(getProductID("iPhone")).initialize());
                Util.println("You've created an iPhone product.");
            } else {
                androids.add(new Android(getProductID("Android")).initialize());
                Util.println("You've created an Android product.");
            }
        } else {
            laptops.add(new Laptop(getProductID("Laptop")).initialize());
            Util.println("You've created a Laptop product.");
        }

        Util.println("");
    }

    // A method to display the list of created products
    public static void displayProducts() {
        // If there are no products created yet, print a message and return.
        if (androids.isEmpty() && iPhones.isEmpty() && laptops.isEmpty()) {
            Util.println("No products have been created yet.");
            return;
        }

        // Check if there are any Android devices created and display them if there are.
        if (androids.size() > 0) {
            Util.println("Android devices: ");

            for (Android android : androids) {
                Util.println(android);
                Util.println("");
            }
        }

        // Check if there are any iPhone devices created and display them if there are.
        if (iPhones.size() > 0) {
            Util.println("Apple devices: ");

            for (IPhone iPhone : iPhones) {
                Util.println(iPhone);
                Util.println("");
            }
        }

        // Check if there are any Laptop devices created and display them if there are.
        if (laptops.size() > 0) {
            Util.println("Laptop devices: ");

            for (Laptop laptop : laptops) {
                Util.println(laptop);
                Util.println("");
            }
        }
    }

    // A method to generate a unique product ID based on the product type and the number of existing products of that type.
    public static String getProductID(String productType) {
        switch (productType) {
            case "Android":
                return "P" + (androids.size() < 10 ? "0" : "") + (androids.size() + 1);
            case "iPhone":
                return "P" + (iPhones.size() < 10 ? "0" : "") + (iPhones.size() + 1);
            case "Laptop":
                return "P" + (laptops.size() < 10 ? "0" : "") + (laptops.size() + 1);
            default:
                throw new IllegalArgumentException("Invalid product type: " + productType);
        }
    }
}