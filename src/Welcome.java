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


        //method to quit or continue
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWould you like to continue or quit? (Type 'c' to continue, 'q' to quit): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("q")) {
            System.out.println("\nThank you for visiting BrainTrust. Goodbye!");
            System.exit(0);
        }
        else{
            System.out.println("\nPlease enter your name: ");
            String name = scanner.nextLine();
            System.out.println("\nWelcome " + name + " to BrainTrust! You can start the quiz.\n");

        }
        System.out.println("\nPlease enter your name: ");
        String name = scanner.nextLine();
        Username = name;
        System.out.println("\nWelcome🙂 " + name + " to BrainTrust! You can start the quiz.\n");
    }
}
