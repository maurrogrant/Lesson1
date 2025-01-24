public class Progression {
    public static void printArithmeticProgression(int a1, int d, int n) {
        System.out.println("Арифметическая прогрессия:");
        for (int i = 0; i < n; i++) {
            System.out.print((a1 + i * d) + " ");
        }
        System.out.println();
    }
}
