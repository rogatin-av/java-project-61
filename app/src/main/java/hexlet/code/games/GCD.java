package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.data.GameConsts;
import hexlet.code.utils.MathUtils;

public class GCD {
    private static final String CONDITION = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] questAndAnsGcdPairs = new String[Engine.NUM_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUM_OF_ROUNDS; i++) {
            questAndAnsGcdPairs[i] = getQuestionAndAnswer();
        }
        Engine.play(CONDITION, questAndAnsGcdPairs);
    }

    private static String[] getQuestionAndAnswer() {
        String[] res = new String[2];
        int a = MathUtils.generateRandomInRange(GameConsts.MIN_VALUE, GameConsts.MAX_VALUE);
        int b = MathUtils.generateRandomInRange(GameConsts.MIN_VALUE, GameConsts.MAX_VALUE);
        res[0] = a + " " + b;
        res[1] = getAnswer(a, b);
        return res;
    }

    private static String getAnswer(int a, int b) {
        return String.valueOf(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
