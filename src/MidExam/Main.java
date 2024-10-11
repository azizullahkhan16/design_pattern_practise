package MidExam;

public class Main {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("I is trying to recieve teh results.");

        SpellCheck spellCheck = new SpellCheck(textEditor);
        spellCheck.process();

        GrammarChecker grammarChecker = new GrammarChecker(textEditor);
        grammarChecker.process();

        AutoCorrector autoCorrector = new AutoCorrector(textEditor);
        autoCorrector.process();

        System.out.println(textEditor.getText());
    }
}
