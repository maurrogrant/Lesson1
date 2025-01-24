public class MultiplicationTable {
    public static void printTable(int number) {
        System.out.println("Таблица умножения для " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
