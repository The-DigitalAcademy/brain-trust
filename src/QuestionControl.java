import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionControl {

    private List<Question> allQuestions;
    private List<Responses> responses;

    private int counter;
    private int rightCounter;

    QuestionControl() {
        CreateQuestions createQuestions = new CreateQuestions();
        this.allQuestions = createQuestions.getQuestions();
        this.responses = new ArrayList<Responses>();
        this.counter = 0;
        this.rightCounter = 0;
    }

    public void showNextQuestion() {
        if (this.counter < this.allQuestions.size()) {
            Question question = this.allQuestions.get(this.counter);
            counter++;
            question.display();
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPlease enter your answer: ");
            String userAnswer = scanner.nextLine();

            boolean correct = checkUserAns(userAnswer, question.getAnswer(), question.getId());
            updateRightCounter(correct);
            showNextQuestion();
        } else {
            displayResults();
        }
    }

    public boolean checkUserAns(String userAnswer, String answer, int id) {
        responses.add(new Responses(id, userAnswer));
        return answer.equals(userAnswer)? true : false;

    }

    public void updateRightCounter(boolean correct){
        if(correct) rightCounter++;
    }

    public void displayResults(){
        int result = (int) ((counter - rightCounter) / counter ) * 100;
        System.out.println("\nQuestion Results:");
        System.out.println("You got " + rightCounter + " out of " + allQuestions.size());
        if(result > 90) {
            System.out.println("\nYou got " + result + " out of 100 - Genius!!!!");
        } else if(result < 75 && result > 50) {
            System.out.println("\nYou got " + result + " out of 100 - Good!");
        } else {
            System.out.println("\nYou got " + result + " out of 100 - Bad!");
        }
    }
}
