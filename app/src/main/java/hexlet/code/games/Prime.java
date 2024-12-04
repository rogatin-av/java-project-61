package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class Prime {
    private static final String CONDITION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUM_OF_ROUNDS; i++) {
            gameData[i] = getQuestionAndAnswer();
        }
        Engine.play(CONDITION, gameData);
    }

    private static String[] getQuestionAndAnswer() {
        String[] res = new String[2];
        final int minValue = 2;
        final int maxValue = 99;
        int num = MathUtils.generateRandomInRange(minValue, maxValue);
        res[0] = String.valueOf(num);
        res[1] = getAnswer(num);
        return res;
    }

    private static String getAnswer(int num) {
        return primeChecker(num) ? "yes" : "no";
    }

    private static boolean primeChecker(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
