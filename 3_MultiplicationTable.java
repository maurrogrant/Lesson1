public class Main
{
	public static void main(String[] args) {
		// Заголовок таблицы
        System.out.println("Таблица умножения:");
        
        // Внешний цикл для чисел от 1 до 10
        for (int i = 1; i <= 10; i++) {
            // Внутренний цикл для умножения
            for (int j = 1; j <= 10; j++) {
                // Вывод результата умножения
                System.out.print(i * j + "\t"); // "\t" для табуляции
            }
            // Переход на новую строку после каждой строки таблицы
            System.out.println();
        }
	}
}
