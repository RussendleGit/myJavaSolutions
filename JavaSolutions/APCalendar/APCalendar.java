import java.time.*;

public class APCalendar {
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year) { /* implementation not shown */
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.isLeapYear();
    }

    /**
     * Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) { /* to be implemented in part (a) */
        // TO BE IMPLEMENTED IN PART (a)
        int start = year1;
        int leapYears = 0;
        while (start <= year2) {
            if (isLeapYear(start)) {
                leapYears++;
            }
            start++;
        }
        return leapYears;
    }

    /**
     * Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year) { /* implementation not shown */
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.getDayOfWeek().getValue();
    }

    /**
     * Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year. Precondition: The
     * date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) { /* implementation not shown */
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfYear();
    }

    /**
     * Returns the value representing the day of the week for the given date (month,
     * day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes
     * Saturday. Precondition: The date represented by month, day, year is a valid
     * date.
     */
    public static int dayOfWeek(int month, int day, int year) { /* to be implemented in part (b) */

        // to be implemented in part b
        // You are limited to only the methods provided in this class.
        // DO NOT USE the LocalDate class.
        int weekDay = day;
        while (weekDay > 7) {
            weekDay -= 7;
        }
        return weekDay + 1; // add 1 to it because it will be wrong. Don't tell me why.

    }

    // There may be instance variables, constructors, and other methods not shown.
}