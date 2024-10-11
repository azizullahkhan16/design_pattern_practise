package MidExam;

public class GrammarChecker extends GrammerCheckerDecorator{

    private TextEditor textEditor;

    public GrammarChecker(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void process() {
        String text = textEditor.getText();
        text = text.replace("I is", "I am");
        textEditor.setText(text);
    }
}
