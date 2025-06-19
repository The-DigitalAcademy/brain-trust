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

        Question question1 = new Question(1, "What is your name", "Banele");
        question1.addOption("Banele");
        question1.addOption("Zoe");

        question1.display();

        for (int i = 1; i <= 5; i++) {
    
            System.out.println("i = " + i);
        }
    }
}