package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class Calc {
    private static final String CONDITION = "What is the result of the expression?";

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
        int a = MathUtils.generateRandomInRange(minValue, maxValue);
        int b = MathUtils.generateRandomInRange(minValue, maxValue);
        String operator = getOperator();
        res[0] =  a + " " + operator + " " + b;
        res[1] = getAnswer(a, b, operator);
        return res;
    }

    private static String getOperator() {
        String[] operators = {"*", "+", "-"};
        final int startOfOps = 0;
        final int endOfOps = 2;
        return operators[MathUtils.generateRandomInRange(startOfOps, endOfOps)];
    }

    private static String getAnswer(int a, int b, String operator) {
        String res = "";
        switch (operator) {
            case "*":
                res += a * b;
                break;
            case "+":
                res += a + b;
                break;
            case "-":
                res += a - b;
                break;
            default:
                System.out.println("Wrong operator: " + operator);
        }
        return res;
    }
}
