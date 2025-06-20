import java.util.Scanner;

public class Welcome {

    static String Username;
    public Welcome() {
        showWelcomeMessage();
    }

    public static void showWelcomeMessage() {
        System.out.println("\n=================================");
        System.out.println("Welcome to BrainTrust🧠");
        System.out.println("Where Knowledge Meets Confidence😎");
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        String name = scanner.nextLine();
        Username = name;
        System.out.println("\nWelcome🙂 " + name + " to BrainTrust! You can start the quiz.\n");
    }
}
