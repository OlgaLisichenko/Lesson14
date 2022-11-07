import java.util.Scanner;

public class Task3 {

    public static String stringReverse(Scanner scanner, String str) {
        System.out.println("Task 3: enter 1 to reverse " + str);
        if (scanner.nextLine().equals("1")) {
            StringFunction stringFunction = newStr -> new StringBuilder(str).reverse().toString();
            return stringFunction.apply(str);
        }
        return str;
    }
}