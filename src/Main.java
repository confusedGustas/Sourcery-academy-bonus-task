import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printBonusDatesBetween(in.nextInt(), in.nextInt());
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        for (int year = fromYear; year <= toYear; year++) {
            for (int month = 1; month <= 12; month++) {
                YearMonth yearMonth = YearMonth.of(year, month);
                for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) {
                    LocalDate date = LocalDate.of(year, month, day);
                    String formattedDate = date.format(dateFormatter);
                    String reversedDate = new StringBuilder(formattedDate).reverse().toString();

                    if (formattedDate.equals(reversedDate)) {
                        System.out.println(date);
                    }
                }
            }
        }
    }
}