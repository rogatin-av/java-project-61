package hexlet.code.games;

import hexlet.code.Engine;

public final class Even implements GameInterface {
    private String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getCondition() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getQuestion() {
        final int minValue = 1;
        final int maxValue = 99;
        var num = Engine.generateRandomInRange(minValue, maxValue);

        setCorrectAnswer(num);

        return num + "";
    }

    private void setCorrectAnswer(int num) {
        correctAnswer = (num % 2 == 0) ? "yes" : "no";
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equals(correctAnswer);
    }
}
