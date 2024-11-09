package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class GCD {
    private static String correctAnswer;

    public static void start() {
        var condition = "Find the greatest common divisor of given numbers.";
        final int questCount = 3;
        var isWin = true;
        Engine.greeting(condition);
        for (int i = 1; i <= questCount; i++) {
            isWin = Engine.play(getQuestion(), correctAnswer);
            if (isWin) {
                Engine.showCorrectMessage();
            } else {
                Engine.showWrongMessage();
                break;
            }
        }
        if (isWin) {
            Engine.showCongratulations();
        }
    }

    private static String getQuestion() {
        final int minValue = 1;
        final int maxValue = 99;
        var a = MathUtils.generateRandomInRange(minValue, maxValue);
        var b = MathUtils.generateRandomInRange(minValue, maxValue);
        var res = MathUtils.gcd(a, b);
        correctAnswer = String.valueOf(res);
        return a + " " + b;
    }
}
