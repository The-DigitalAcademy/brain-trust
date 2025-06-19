import java.util.ArrayList;
import java.util.List;

public class CreateQuestions {

    private List<Question> questions;

    public CreateQuestions() {
        this.questions = new ArrayList<>();
        addQuestions();
    }

    public void addQuestions() {
        Question question1 = new Question(1, "What is your name", "Banele");
        question1.addOption("Mellow");
        question1.addOption("Tega");
        question1.addOption("Banele");
        questions.add(question1);
        Question question2 = new Question(2, "Who is SA president", "Ramaphosa");
        question2.addOption("Zuma");
        question2.addOption("Trump");
        question2.addOption("Mugabe");
        question2.addOption("Zelensky");
        question2.addOption("Ramaphosa");
        questions.add(question2);
        Question question3 = new Question(3, "What color is water", "clear");
        question3.addOption("Blue");
        question3.addOption("Yellow");
        question3.addOption("Green");
        question3.addOption("Clear");
        questions.add(question3);
        Question question4 = new Question(4, "How many colors are in SA flag", "6");
        question4.addOption("7");
        question4.addOption("8");
        question4.addOption("9");
        question4.addOption("6");
        questions.add(question4);
        Question question5 = new Question(5, "Who killed Gadafi", "Obama");
        question5.addOption("Banele");
        question5.addOption("Ramaphosa");
        question5.addOption("Obama");
        questions.add(question5);
        Question question6 = new Question(6, "Where is Paris", "France");
        question6.addOption("USA");
        question6.addOption("UK");
        question6.addOption("RSA");
        questions.add(question6);
        Question question7 = new Question(7, "Who is USA president", "Trump");
        question7.addOption("Mugabe");
        question7.addOption("Zelensky");
        question7.addOption("Obama");
        question7.addOption("Zuma");
        question7.addOption("Trump");
        questions.add(question7);
        Question question8 = new Question(8, "Who stole R200 Million for Nkandla?", "Zuma");
        question8.addOption("Zelensky");
        question8.addOption("Zuma");
        question8.addOption("Ramaphosa");
        question8.addOption("Obama");
        questions.add(question8);
        Question question9 = new Question(9, "Who said kiss the Boer?", "Malema");
        question9.addOption("Zelensky");
        question9.addOption("Zuma");
        question9.addOption("Malema");
        question9.addOption("Motsepe");
        questions.add(question9);
        Question question10 = new Question(10, "What went to MK when EFF was fighting", "Shivambu");
        question10.addOption("Ndlozi");
        question10.addOption("Shivambu");
        question10.addOption("Malema");
        question10.addOption("Motsepe");
        questions.add(question10);
        Question question11= new Question(11, "Who acts as God i Almighty movie", "Freeman");
        question11.addOption("Freeman");
        question11.addOption("Kate");
        question11.addOption("White");
        questions.add(question11);
        Question question12 = new Question(12, "What is Ndivho's fav color?", "Blue");
        question12.addOption("Blue");
        question12.addOption("Brown");
        question12.addOption("Yellow");
        question12.addOption("Green");
        question12.addOption("Red");
        question12.addOption("White");
        questions.add(question12);
        Question question13 = new Question(13, "Who is Godfrey", "Tsegofatso");
        question13.addOption("Tsegofatso");
        question13.addOption("Steezy");
        question13.addOption("Hardy");
        questions.add(question13);
        Question question14 = new Question(14, "Who landed on the moon first?", "Armstrong");
        question14.addOption("Armstrong");
        question14.addOption("Brian");
        question14.addOption("Luis");
        question14.addOption("Leil");
        questions.add(question14);
        Question question15 = new Question(15, "What is the users surname", "Ndlovu");
        question15.addOption("Ndlovu");
        question15.addOption("Luthuli");
        question15.addOption("Msomi");
        question15.addOption("Mellow");
        questions.add(question15);

    }

    public List<Question> getQuestions() {
        return this.questions;
    }
}
