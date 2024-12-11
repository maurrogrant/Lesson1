public class NumberDescription {
    public static void main(String[] args) {
        // Задаем число
        int number = -5;

        // Описание числа
        describeNumber(number);
    }

    // Метод для описания числа
    public static void describeNumber(int number) {
        // Проверка на положительное, отрицательное или нулевое
        if (number > 0) {
            System.out.print("Число положительное, ");
        } else if (number < 0) {
            System.out.print("Число отрицательное, ");
        } else {
            System.out.print("Число равно нулю, ");
        }

        // Проверка на четное или нечетное
        if (number % 2 == 0) {
            System.out.println("и четное.");
        } else {
            System.out.println("и нечетное.");
        }
    }
}
