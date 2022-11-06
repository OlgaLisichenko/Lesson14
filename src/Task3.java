import java.util.Scanner;

public class Task3 {

    public static MyInterface stringReverse(Scanner scanner, String s) {
        System.out.println("Task 3: enter 1 to reverse " + s);
        if (scanner.next().equals("1")) {
            return str -> new StringBuilder(str).reverse().toString();
        }
        return str -> str;
    }
}