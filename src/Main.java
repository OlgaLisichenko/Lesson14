import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ofPattern;
import static java.time.temporal.TemporalAdjusters.next;

/**
 * <p> 1. Написать программу для вывода на консоль названия дня недели по введенной дате.
 * <p> 2. Написать программу для вывода на экран дату следующего вторника.
 * <p> 3. Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом. В нём реализовать логику:
 * если в консоль введена цифра 1, то использовать интерфейс со строковым типом
 * и передать в метод интерфейса логику реверса строки (вывода строки в обратном порядке).
 */
public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("This day is " + getDayOfWeek(scanner));
            System.out.println("Task 2: next Tuesday will be " + getDateOfNextTuesday());
            String stringForReverse = "A B C D";
            System.out.println(Task3.stringReverse(scanner, stringForReverse));
        }
    }

    public static DayOfWeek getDayOfWeek(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Task 1: enter the date in the format dd-MM-yyyy");
                return LocalDate.parse(scanner.nextLine(), ofPattern("dd-MM-yyyy"))
                                .getDayOfWeek();
            } catch (DateTimeParseException ignored) {
            }
        }
    }

    public static LocalDate getDateOfNextTuesday() {
        return LocalDate.now().with(next(DayOfWeek.TUESDAY));
    }
}