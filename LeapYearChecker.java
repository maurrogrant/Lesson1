public class LeapYearChecker {
    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 150 == 0) || (year % 4 == 0);
        if (isLeap) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
}
