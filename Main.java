import java.util.ArrayList;

public class Main {
    public static ArrayList<Android> androids = new ArrayList<>();
    public static ArrayList<iPhone> iPhones = new ArrayList<>();
    public static ArrayList<Laptop> laptops = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            if (!Util.input("Would you like to create a new product (Y/n): ").equalsIgnoreCase("Y")) {
                break;
            }

            boolean hasMobileData = !Util.input("Does your product use mobile data (Y/n): ").equalsIgnoreCase("n");

            if (hasMobileData) {
                boolean hasAirDrop = !Util.input("Are you sharing files between Apple devices (Y/n): ").equalsIgnoreCase("n");

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

            for (int i = 0; i < androids.size(); i++) {
                Android element = androids.get(i);

                Util.println(element);
                System.err.println();
            }
        }

        if (iPhones.size() > 0) {
            Util.println("Apple devices: ");

            for (int i = 0; i < iPhones.size(); i++) {
                iPhone element = iPhones.get(i);

                Util.println(element);
                System.err.println();
            }
        }

        if (laptops.size() > 0) {
            Util.println("Android devices: ");

            for (int i = 0; i < laptops.size(); i++) {
                Laptop element = laptops.get(i);

                Util.println(element);
                System.err.println();
            }
        }
    }
}