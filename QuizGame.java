import java.util.Scanner;

class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(answer);
    }

    public String getQuestion() {
        return question;
    }
}

public class QuizGame {
    private int level = 1;
    private int points = 0;

    public void play() {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = {
            new Question("Apa nama Ibu Kota Indonesia ?", "IKN"),
            new Question("Berapa Jumlah dari 5 + 3 ?", "8"),
            new Question("Siapakah nama murid paling tampan di 11.1 ?", "Lewis"),
            new Question("Berapakah jumlah dari 37+200 ?", "237")
        };

        for (Question q : questions) {
            System.out.println("Level " + level);
            System.out.println(q.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (q.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                addPointsForLevel();
                level++;
            } else {
                System.out.println("Wrong answer.");
                break;
            }
        }

        System.out.println("Game over!");
        System.out.println("Total points: " + points);
        System.out.println("Level reached: " + level);

        scanner.close();
    }

    private void addPointsForLevel() {
        switch (level) {
            case 1 -> points += 0;
            case 2 -> points += 20;
            case 3 -> points += 40;
            case 4 -> points += 60;
        }
    }

    public static void main(String[] args) {
        QuizGame game = new QuizGame();
        game.play();
    }
}
