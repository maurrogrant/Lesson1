public class MinFinder {
    public static void findMin(int num1, int num2) {
        int minimum = (num1 < num2) ? num1 : num2;
        System.out.println("Минимальное число: " + minimum);
    }
}
