import java.util.ArrayList;

public class Main {
    public static ArrayList<Android> androids = new ArrayList<>();
    public static ArrayList<iPhone> iPhones = new ArrayList<>();
    public static ArrayList<Laptop> laptops = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            if (!Util.confirm("Would you like to create a new product (Y/n): ")) {
                break;
            }

            boolean hasMobileData = Util.confirm("Does your product use mobile data (Y/n): ");

            if (hasMobileData) {
                boolean hasAirDrop = Util.confirm("Are you sharing files between Apple devices (Y/n): ");

                if (hasAirDrop) {
                    iPhones.add(new iPhone(getProductID("iPhone")).initialize());
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

        if (!androids.isEmpty() || !iPhones.isEmpty() || !laptops.isEmpty()) {
            Util.println("");
            displayProducts();
        }
    }

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

    public static void displayProducts() {
        Util.println("--------------- DISPLAYING PRODUCTS ---------------");

        if (androids.size() > 0) {
            Util.println("Android devices: ");
            Util.println("");

            for (Android android : androids) {
                Util.println(android);
                Util.println("");
            }
        }

        if (iPhones.size() > 0) {
            Util.println("Apple devices: ");

            for (iPhone iPhone : iPhones) {
                Util.println(iPhone);
                Util.println("");
            }
        }

        if (laptops.size() > 0) {
            Util.println("Laptop devices: ");

            for (Laptop laptop : laptops) {
                Util.println(laptop);
                Util.println("");
            }
        }
    }
}