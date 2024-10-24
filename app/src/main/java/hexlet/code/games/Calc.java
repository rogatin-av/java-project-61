package hexlet.code.games;

import hexlet.code.Engine;

public final class Calc implements GameInterface {
    private int correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer + "";
    }

    public String getCondition() {
        return "What is the result of the expression?";
    }

    public String getQuestion() {
        final int minValue = 1;
        final int maxValue = 99;
        var a = Engine.generateRandomInRange(minValue, maxValue);
        var b = Engine.generateRandomInRange(minValue, maxValue);
        char[] operators = {'*', '+', '-'};
        final int startOfOps = 0;
        final int endOfOps = 2;
        var operator = operators[Engine.generateRandomInRange(startOfOps, endOfOps)];

        setCorrectAnswer(a, b, operator);

        return a + " " + operator + " " + b;
    }

    private void setCorrectAnswer(int a, int b, char operator) {
        switch (operator) {
            case '*':
                correctAnswer = a * b;
                break;
            case '+':
                correctAnswer = a + b;
                break;
            case '-':
                correctAnswer = a - b;
                break;
            default:
                // checkstyle
        }
    }

    public boolean checkAnswer(String userAnswer) {
        return correctAnswer == Integer.parseInt(userAnswer);
    }
}
