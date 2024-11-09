package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class Even {
    private static String correctAnswer;

    public static void start() {
        var condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int questCount = 3;
        var isWin = true;
        Engine.greeting(condition);
        for (int i = 1; i <= questCount; i++) {
            isWin = Engine.play(getQuestion(), correctAnswer);
            if (isWin) {
                Engine.showCorrectMessage();
            } else  {
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
        var num = MathUtils.generateRandomInRange(minValue, maxValue);
        correctAnswer = (num % 2 == 0) ? "yes" : "no";
        return num + "";
    }
}
