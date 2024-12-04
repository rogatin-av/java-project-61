package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class Even {
    private static final String CONDITION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUM_OF_ROUNDS; i++) {
            gameData[i] = getQuestionAndAnswer();
        }
        Engine.play(CONDITION, gameData);
    }

    private static String[] getQuestionAndAnswer() {
        String[] res = new String[2];
        final int minValue = 1;
        final int maxValue = 99;
        int num = MathUtils.generateRandomInRange(minValue, maxValue);
        res[0] = String.valueOf(num);
        res[1] = getAnswer(num);
        return res;
    }

    private static String getAnswer(int question) {
        return (question % 2 == 0) ? "yes" : "no";
    }
}
