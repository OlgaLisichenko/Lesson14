import java.util.Scanner;

public class Task3 {

    public static String stringReverse(Scanner scanner, String str) {
        System.out.println("Task 3: enter 1 to reverse " + str);
        if (scanner.nextLine().equals("1")) {
            ToStringFunction<String> function = s -> new StringBuilder(s).reverse().toString();
            return function.apply(str);
        }
        return str;
    }
}