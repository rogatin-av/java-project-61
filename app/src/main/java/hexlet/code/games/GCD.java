package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD implements GameInterface {
    private int correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer + "";
    }

    public String getCondition() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getQuestion() {
        final int minValue = 1;
        final int maxValue = 99;
        var a = Engine.generateRandomInRange(minValue, maxValue);
        var b = Engine.generateRandomInRange(minValue, maxValue);

        var res = Engine.gcd(a, b);
        setCorrectAnswer(res);

        return a + " " + b;
    }

    private void setCorrectAnswer(int num) {
        correctAnswer = num;
    }

    public boolean checkAnswer(String userAnswer) {
        return correctAnswer == Integer.parseInt(userAnswer);
    }
}
