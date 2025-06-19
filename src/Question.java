import java.util.ArrayList;
import java.util.List;

public class Question {
    private int id;
    private String question;
    private String answer;
    private List<String> options;

    Question(int id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.options = new ArrayList<>();
    }

    public void addOption(String option) {
        this.options.add(option);
    }

    public void display() {
        System.out.println(question);
        for (String option : options) {
            System.out.println("- " + option);
        }
    }

    public String getAnswer() {
        return this.answer;
    }

    public int getId() {
        return this.id;
    }

}
