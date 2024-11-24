package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class Calc {

    public static void start() {
        var condition = "What is the result of the expression?";
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
        String[] operators = {"*", "+", "-"};
        final int startOfOps = 0;
        final int endOfOps = 2;
        var operator = operators[MathUtils.generateRandomInRange(startOfOps, endOfOps)];
        res[0] =  a + " " + operator + " " + b;
        res[1] = getAnswer(a, b, operator);
        return res;
    }

    private static String getAnswer(int a, int b, String operator) {
        var res = "";
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
