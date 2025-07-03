import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionControl {

    private List<Question> quizQuestions;

    private int counter;
    private int rightCounter;

    QuestionControl() {
        quizQuestions = new ArrayList<>();
        this.counter = 0;
        this.rightCounter = 0;
        createRandomQuestions();
        showNextQuestion();
    }

    public void createRandomQuestions(){
        int i = 0;
        int random;
        List<Integer> randomize = new ArrayList<>();

        while(i < 10){
            random = (int) (Math.random() * 15);
            if(randomize.size() == 0 ){
                randomize.add(random);
                quizQuestions.add( new CreateQuestions().getQuestions().get(random));
                i++;
            }
            if(!randomize.contains(random)){
                randomize.add(random);
                quizQuestions.add( new CreateQuestions().getQuestions().get(random));
                i++;
            }
        }
    }

    public void showNextQuestion() {
        if (this.counter < this.quizQuestions.size()) {
            Question question = this.quizQuestions.get(this.counter);
            this.counter++;
            System.out.println("\n======================\nQuestion "+ counter +" / 10 ");
            question.display();

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPlease enter your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            List<String> options = question.getOptions();
            String selectedAnswer = null;

             if (!userAnswer.isEmpty() && userAnswer.charAt(0) >= 'a' && userAnswer.charAt(0) < 'a' + options.size()) {
                int index = userAnswer.charAt(0) - 'a';
                selectedAnswer = options.get(index);
        } else {
                System.out.println("Invalid option. Please choose a valid letter.");
                this.counter--; 
                showNextQuestion();
                return;
    }checkUserAns(selectedAnswer, question, question.getId());
            showNextQuestion();
        } else {
            displayResults();
        }
    }

    public void checkUserAns(String userAnswer, Question question, int id) {
        Responses response = new Responses(id, userAnswer);
        response.storeAndCheckUserAnswer(response.userAnswer, question);

    }

    public void displayResults(){
        this.rightCounter = Responses.getRightCounter();
        double result = (double) this.rightCounter / counter * 100;

        System.out.println("======================\nQuestion Results:\n======================");
        System.out.println("You got " + rightCounter + " out of " + quizQuestions.size());

        if(result >= 90) {
            System.out.println("\nYou got " + result + " out of 100 - Genius!!!!");
        } else if(result <= 75 || result >= 50) {
            System.out.println("\nYou got " + result + " out of 100 - Good!");
        } else {
            System.out.println("\nYou got " + result + " out of 100 - Bad!");
        }
    }
}
