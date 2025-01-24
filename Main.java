import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите задачу:");
            System.out.println("1. Найти минимальное из двух чисел");
            System.out.println("2. Описать введенное число");
            System.out.println("3. Вывести таблицу умножения");
            System.out.println("4. Вывести арифметическую прогрессию");
            System.out.println("5. Проверить, является ли год високосным");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите первое число: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    int num2 = scanner.nextInt();
                    MinFinder.findMin(num1, num2);
                    break;
                case 2:
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    NumberDescription.describeNumber(number);
                    break;
                case 3:
                    System.out.print("Введите число для таблицы умножения: ");
                    int tableNumber = scanner.nextInt();
                    MultiplicationTable.printTable(tableNumber);
                    break;
                case 4:
                    System.out.print("Введите первый член прогрессии: ");
                    int a1 = scanner.nextInt();
                    System.out.print("Введите разность прогрессии: ");
                    int d = scanner.nextInt();
                    System.out.print("Введите количество членов: ");
                    int n = scanner.nextInt();
                    Progression.printArithmeticProgression(a1, d, n);
                    break;
                case 5:
                    System.out.print("Введите год: ");
                    int year = scanner.nextInt();
                    LeapYearChecker.checkLeapYear(year);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
