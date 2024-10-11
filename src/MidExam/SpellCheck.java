package MidExam;

public class SpellCheck extends SpellCheckDecorator{
    private TextEditor textEditor;

    public SpellCheck(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void process() {
        String text = textEditor.getText();
        text = text.replace("teh", "the");
        textEditor.setText(text);
    }
}
