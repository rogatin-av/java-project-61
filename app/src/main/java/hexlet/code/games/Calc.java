package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.MathUtils;

public class Calc {
    private static String correctAnswer;

    public static void start() {
        var condition = "What is the result of the expression?";
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
        var a = MathUtils.generateRandomInRange(minValue, maxValue);
        var b = MathUtils.generateRandomInRange(minValue, maxValue);
        char[] operators = {'*', '+', '-'};
        final int startOfOps = 0;
        final int endOfOps = 2;
        var operator = operators[MathUtils.generateRandomInRange(startOfOps, endOfOps)];
        switch (operator) {
            case '*':
                correctAnswer = String.valueOf(a * b);
                break;
            case '+':
                correctAnswer = String.valueOf(a + b);
                break;
            case '-':
                correctAnswer = String.valueOf(a - b);
                break;
            default:
                System.out.println("Wrong operator: " + operator);
        }
        return a + " " + operator + " " + b;
    }
}
