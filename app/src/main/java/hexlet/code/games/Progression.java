package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression implements GameInterface {
    private int correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer + "";
    }

    public String getCondition() {
        return "What number is missing in the progression?";
    }

    public String getQuestion() {
        int length = Engine.generateRandomInRange(5, 10);
        int step = Engine.generateRandomInRange(2, 5);
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
