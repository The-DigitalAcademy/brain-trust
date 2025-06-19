import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n=================================");
        System.out.println("Welcome to BrainTrust");
        System.out.println("Where Knowledge Meets Confidence");
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        String name = scanner.nextLine();
        System.out.println("\nWelcome " + name + " to BrainTrust" + "! You can start the quiz.\n");
        QuestionControl control = new QuestionControl();
        control.showNextQuestion();

    }
}