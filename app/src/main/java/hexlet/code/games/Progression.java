package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

import java.util.StringJoiner;

public class Progression {
    private static final String CONDITION = "What number is missing in the progression?";

    public static void start() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUM_OF_ROUNDS; i++) {
            gameData[i] = getQuestionAndAnswer();
        }
        Engine.play(CONDITION, gameData);
    }

    private static String[] getQuestionAndAnswer() {
        final int minLength = 5;
        final int maxLength = 10;
        int length = MathUtils.generateRandomInRange(minLength, maxLength);
        final int minStep = 2;
        final int maxStep = 5;
        int step = MathUtils.generateRandomInRange(minStep, maxStep);
        int hiddenNum = MathUtils.generateRandomInRange(1, length);
        return getProgression(length, step, hiddenNum);
    }

    private static String[] getProgression(int length, int step, int hiddenNum) {
        String[] res = new String[2];
        int currentNum = 1;
        StringJoiner progression = new StringJoiner(" ");
        for (int i = 1; i <= length; i++) {
            if (i == hiddenNum) {
                progression.add("..");
                res[1] = String.valueOf(currentNum);
            } else {
                progression.add(String.valueOf(currentNum));
            }
            currentNum += step;
        }
        res[0] = progression.toString();
        return res;
    }
}
