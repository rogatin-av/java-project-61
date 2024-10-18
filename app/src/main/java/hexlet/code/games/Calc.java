package hexlet.code.games;

import hexlet.code.Engine;

public class Calc implements GameInterface {
    private int correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer + "";
    }

    public String getCondition() {
        return "What is the result of the expression?";
    }

    public String getQuestion() {
        var a = Engine.generateRandomInRange(1, 99);
        var b = Engine.generateRandomInRange(1, 99);
        char[] operators = {'*', '+', '-'};
        var operator = operators[Engine.generateRandomInRange(0, 2)];

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
