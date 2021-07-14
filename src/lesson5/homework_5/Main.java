package lesson5.homework_5;

public class Main {
    public static void main(String[] args) {

    }

    private static double exponentiation(double value, int power) {
        if (value == 0 && power <= 0){
            throw new ArithmeticException("нуль");
        }
        if (power == 0) {
            return 1;
        } else if (power < 0) {
            return 1 / value * exponentiation(value, ++power);
        } else {
            return value * exponentiation(value, --power);
        }
    }
}
