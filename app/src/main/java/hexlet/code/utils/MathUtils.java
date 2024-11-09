package hexlet.code.utils;

public class MathUtils {

    public static int generateRandomInRange(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }

    public static boolean primeChecker(int num) {
        for (var i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
