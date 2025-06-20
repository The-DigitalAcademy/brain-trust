import java.util.List;
import java.util.Scanner;

public class QuestionControl {

    private List<Question> allQuestions;
    private int counter;
    private Scanner scanner;

    QuestionControl() {
        CreateQuestions createQuestions = new CreateQuestions();
        this.allQuestions = createQuestions.getQuestions();
        this.scanner = new Scanner(System.in);
        this.counter = 0;
    }

    public void showNextQuestion() {
        if (counter < allQuestions.size()) {
            Question question = allQuestions.get(counter);
            counter++;

            question.display();
            System.out.println("\nPlease enter your answer: ");
            String userAnswer = scanner.nextLine();

            Responses.storeAndCheckUserAnswer(userAnswer, question);

            showNextQuestion();
        } else {
            System.out.println("\nQuiz complete.");
            scanner.close();

        }
    }
}
