package hexlet.code.games;

public class Even implements GameInterface {
    private String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getCondition() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getQuestion() {
        var num = (int) (Math.random() * 100 + 1);

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
