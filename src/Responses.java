import java.util.ArrayList;
import java.util.List;

public class Responses {

    private static List<Responses> responseList = new ArrayList<>();
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
            System.out.println("You got it correct! \n================================");
            rightCounter++;
        } else {
            System.out.println("You got it wrong! \n===================================");
        }
    }

    public static List<Responses> getAllResponses() {
        return responseList;
    }

    public static int getRightCounter(){
        return rightCounter;
    }
}
