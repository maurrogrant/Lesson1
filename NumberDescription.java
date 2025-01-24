public class NumberDescription {
    public static void describeNumber(int number) {
        String sign = (number > 0) ? "положительное" : (number < 0) ? "отрицательное" : "ноль";
        String parity = (number % 2 == 0) ? "чётное" : "нечётное";
        System.out.println("Число " + number + " является " + sign + " и " + parity + ".");
    }
}
