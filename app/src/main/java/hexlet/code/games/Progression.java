package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public final class Progression implements GameInterface {
    private int correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer + "";
    }

    public String getCondition() {
        return "What number is missing in the progression?";
    }

    public String getQuestion() {

        final int minLength = 5;
        final int maxLength = 10;
        int length = Engine.generateRandomInRange(minLength, maxLength);
        final int minStep = 2;
        final int maxStep = 5;
        int step = Engine.generateRandomInRange(minStep, maxStep);
        int hiddenNum = Engine.generateRandomInRange(1, length);
        int currentNum = 1;
        var res = new StringJoiner(" ");

        for (var i = 1; i <= length; i++) {
            if (i == hiddenNum) {
                res.add("..");
                setCorrectAnswer(currentNum);
            }  else {
                res.add(String.valueOf(currentNum));
            }
            currentNum += step;
        }

        return res.toString();
    }

    private void setCorrectAnswer(int num) {
        correctAnswer = num;
    }

    public boolean checkAnswer(String userAnswer) {
        return correctAnswer == Integer.parseInt(userAnswer);
    }
}
