import java.util.ArrayList;
import java.util.List;

public class Responses {

    private static List<Responses> responseList = new ArrayList<>();
    private static List<Integer> userScores = new ArrayList<>();
    private static int correctAnswersCount = 0;




    public int questionId;
    public String userAnswer;

    public Responses(int questionId, String userAnswer) {
        this.questionId = questionId;
        this.userAnswer = userAnswer;
    }

    public static void storeAndCheckUserAnswer(String userAnswer, Question question) {
        responseList.add(new Responses(question.getId(), userAnswer));

        if (question.getAnswer().equalsIgnoreCase(userAnswer)) {

            System.out.println("You got it correct!✅");
            correctAnswersCount++;

          
        } else {
            System.out.println("You got it wrong!❌ \n================================================");
        }
        userScores.add(correctAnswersCount);
    }

    public static void displayResults(String userName) {
        int finalScore = correctAnswersCount;
        String grade;

        if (finalScore >= 8) {
            grade = "Excellent🔆🔆";
        } else if (finalScore >= 5) {
            grade = "Pass✅";
        } else if (finalScore == 4) {
            grade = "Supplementary⭕";
        } else {
            grade = "Fail❌";
        }


        System.out.println("You have reached the end of your MCQ test " + userName + ", your results are as follows:");
        System.out.println("Score: " + finalScore + " out of 10");
        System.out.println("Grade: " + grade);
        if (grade.equals("Fail❌")){
            System.out.println("Unfortunately you didn't perform well❌ " + userName + " , go work!📙");

        } else if (grade.equals("Supplementary⭕")) {
            System.out.println("You didn't perform well "  +userName + ", but you qualify for a second shot, so go study📙");
        } else if (grade.equals("Pass✅")) {
            System.out.println("Well done✨ " + userName + " --there is still room for more!");
        }
        else System.out.println("You are a star ✨ " + userName + "🥇");

    }

    public static List<Responses> getAllResponses() {
        return responseList;
    }



}

