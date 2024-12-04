package hexlet.code.utils;

public class MathUtils {

    public static int generateRandomInRange(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }
}
