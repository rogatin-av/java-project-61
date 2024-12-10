package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.data.GameConsts;
import hexlet.code.utils.MathUtils;

public class Even {
    private static final String CONDITION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] questAndAnsEvenPairs = new String[Engine.NUM_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUM_OF_ROUNDS; i++) {
            questAndAnsEvenPairs[i] = getQuestionAndAnswer();
        }
        Engine.play(CONDITION, questAndAnsEvenPairs);
    }

    private static String[] getQuestionAndAnswer() {
        String[] res = new String[2];
        int num = MathUtils.generateRandomInRange(GameConsts.MIN_VALUE, GameConsts.MAX_VALUE);
        res[0] = String.valueOf(num);
        res[1] = getAnswer(num);
        return res;
    }

    private static String getAnswer(int question) {
        return (question % 2 == 0) ? "yes" : "no";
    }
}
