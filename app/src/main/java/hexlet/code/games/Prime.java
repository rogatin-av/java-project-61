package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime implements GameInterface {
    private String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getCondition() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getQuestion() {
        final int minValue = 2;
        final int maxValue = 99;
        var num = Engine.generateRandomInRange(minValue, maxValue);

        setCorrectAnswer(num);

        return num + "";
    }

    private void setCorrectAnswer(int num) {
        correctAnswer = Engine.primeChecker(num);
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equals(correctAnswer);
    }
}
