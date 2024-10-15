package hexlet.code.games;

public interface GameInterface {
    String getCondition();
    String getCorrectAnswer();
    String getQuestion();
    boolean checkAnswer(String userAnswer);
}
