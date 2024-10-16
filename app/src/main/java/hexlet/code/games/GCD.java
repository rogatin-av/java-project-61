package hexlet.code.games;

public class GCD implements GameInterface {
    private int correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer + "";
    }

    public String getCondition() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getQuestion() {
        var a = (int) (Math.random() * 10);
        var b = (int) (Math.random() * 10);

        var res = gcd(a, b);
        setCorrectAnswer(res);

        return a + " " + b;
    }

    private int gcd(int a, int b) {

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    private void setCorrectAnswer(int num) {
        correctAnswer = num;
    }

    public boolean checkAnswer(String userAnswer) {
        return correctAnswer == Integer.parseInt(userAnswer);
    }
}
