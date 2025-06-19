import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Hello and welcome!");
        Question question1 = new Question(1, "What is your name", "Banele");
        question1.addOption("Banele");
        question1.addOption("Zoe");

        question1.display();
    }
}