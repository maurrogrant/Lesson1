public class Main {
    public static void main(String[] args) {
        // Задаем параметры
        int n = 10; // Количество чисел
        int type = 2; // 1 - арифметическая, 2 - геометрическая
        double start = 2; // Начальное значение
        double stepOrRatio = 3; // Шаг для арифметической или коэффициент для геометрической

        // Выбор прогрессии
        if (type == 1) {
            printArithmeticProgression(n, start, stepOrRatio);
        } else if (type == 2) {
            printGeometricProgression(n, start, stepOrRatio);
        } else {
            System.out.println("Неверный тип прогрессии.");
        }
    }

    // Метод для вывода арифметической прогрессии
    public static void printArithmeticProgression(int n, double start, double step) {
        System.out.println("Арифметическая прогрессия:");
        for (int i = 0; i < n; i++) {
            System.out.print((start + i * step) + " ");
        }
        System.out.println();
    }

    // Метод для вывода геометрической прогрессии
    public static void printGeometricProgression(int n, double start, double ratio) {
        System.out.println("Геометрическая прогрессия:");
        for (int i = 0; i < n; i++) {
            System.out.print((start * Math.pow(ratio, i)) + " ");
        }
        System.out.println();
    }
}
