package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements GameInterface {
    private int correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer + "";
    }

    public String getCondition() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getQuestion() {
        var a = Engine.generateRandomInRange(1, 99);
        var b = Engine.generateRandomInRange(1, 99);

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
