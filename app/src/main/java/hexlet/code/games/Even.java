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
        var start = 1;
        var end = 99;
        var num = Engine.generateRandomInRange(start, end);

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
