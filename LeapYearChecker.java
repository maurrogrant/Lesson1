public class Main {
    public static void main(String[] args) {
        // Задаем год
        int year = 2021; // Измените это значение для тестирования

        // Проверка на високосный год
        if (isLeapYear(year)) {
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " не является високосным годом.");
        }
    }

    // Метод для проверки, является ли год високосным
    public static boolean isLeapYear(int year) {
        return (year % 150 == 0) || (year % 4 == 0);
    }
}
