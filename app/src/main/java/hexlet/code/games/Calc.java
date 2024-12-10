package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.data.GameConsts;
import hexlet.code.utils.MathUtils;

public class Calc {
    private static final String CONDITION = "What is the result of the expression?";

    public static void start() {
        String[][] questAndAnsCalcPairs = new String[Engine.NUM_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUM_OF_ROUNDS; i++) {
            questAndAnsCalcPairs[i] = getQuestionAndAnswer();
        }
        Engine.play(CONDITION, questAndAnsCalcPairs);
    }

    private static String[] getQuestionAndAnswer() {
        String[] res = new String[2];
        int a = MathUtils.generateRandomInRange(GameConsts.MIN_VALUE, GameConsts.MAX_VALUE);
        int b = MathUtils.generateRandomInRange(GameConsts.MIN_VALUE, GameConsts.MAX_VALUE);
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
