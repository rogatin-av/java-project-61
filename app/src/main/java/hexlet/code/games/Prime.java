package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class Prime {

    public static void start() {
        var condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        final int minValue = 2;
        final int maxValue = 99;
        var num = MathUtils.generateRandomInRange(minValue, maxValue);
        res[0] = String.valueOf(num);
        res[1] = getAnswer(num);
        return res;
    }

    private static String getAnswer(int num) {
        return MathUtils.primeChecker(num) ? "yes" : "no";
    }
}
