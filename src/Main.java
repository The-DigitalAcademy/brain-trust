public class Main {
    public static void main(String[] args) {

        Welcome.showWelcomeMessage();

        Question question1 = new Question(1, "What is your name", "Banele");
        question1.addOption("Banele");
        question1.addOption("Zoe");

        question1.display();

        for (int i = 1; i <= 5; i++) {
    
            System.out.println("i = " + i);
        }
    }
}