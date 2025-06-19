
public class Main {

    public static void main(String[] args) {

        Question question1 = new Question(1, "What is your name", "Banele");
        question1.addOption("Banele");
        question1.addOption("Zoe");

        question1.display();
    }
}