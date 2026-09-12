import java.util.Scanner;

public class Util {
    public static Scanner scanner = new Scanner(System.in);

    public static void println(Object message) {
        System.out.println(message);
    }

    public static String input(Object message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
