import java.util.ArrayList;
import java.util.List;

public class Responses {

    private static List<Responses> responseList = new ArrayList<>();
    private static List<Integer> userScores = new ArrayList<>();
    private static int correctAnswersCount = 0;

    private static int rightCounter = 0;


    public int questionId;
    public String userAnswer;

    public Responses(int questionId, String userAnswer) {
        this.questionId = questionId;
        this.userAnswer = userAnswer;
    }

    public static void storeAndCheckUserAnswer(String userAnswer, Question question) {
        responseList.add(new Responses(question.getId(), userAnswer));

        if (question.getAnswer().equalsIgnoreCase(userAnswer)) {

            System.out.println("You got it correct!");
            correctAnswersCount++;
          rightCounter++;
          
        } else {
            System.out.println("You got it wrong! \n===================================");
        }
        userScores.add(correctAnswersCount);
    }

    public static void displayResults(String userName) {
        int finalScore = correctAnswersCount;
        String grade;

        if (finalScore >= 8) {
            grade = "Excellent";
        } else if (finalScore >= 5) {
            grade = "Pass";
        } else if (finalScore == 4) {
            grade = "Supplementary";
        } else {
            grade = "Fail";
        }

        System.out.println("Results for: " + userName);
        System.out.println("Score: " + finalScore + " out of 10");
        System.out.println("Grade: " + grade);
    }

    public static List<Responses> getAllResponses() {
        return responseList;
    }


    public static int getRightCounter(){
        return rightCounter;
    }
}

