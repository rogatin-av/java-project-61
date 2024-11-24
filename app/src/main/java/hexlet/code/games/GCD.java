package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class GCD {

    public static void start() {
        var condition = "Find the greatest common divisor of given numbers.";
        var questions = new String[Engine.NUM_OF_ROUNDS];
        var answers = new String[Engine.NUM_OF_ROUNDS];
        for (int i = 0; i < Engine.NUM_OF_ROUNDS; i++) {
            var gameData = getQuestionAndAnswer();
            questions[i] = gameData[0];
            answers[i] = gameData[1];
        }
        Engine.play(condition, questions, answers);
    }

    private static String[] getQuestionAndAnswer() {
        var res = new String[2];
        final int minValue = 1;
        final int maxValue = 99;
        var a = MathUtils.generateRandomInRange(minValue, maxValue);
        var b = MathUtils.generateRandomInRange(minValue, maxValue);
        res[0] = a + " " + b;
        res[1] = getAnswer(a, b);
        return res;
    }

    private static String getAnswer(int a, int b) {
        return String.valueOf(MathUtils.gcd(a, b));
    }
}
