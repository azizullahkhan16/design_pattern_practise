package MidExam;

public class AutoCorrector extends AutoCorrectorDecorator{
    private TextEditor textEditor;

    public AutoCorrector(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void process() {
        String text = textEditor.getText();
        text = text.replace("recieve", "receive");
        textEditor.setText(text);
    }
}
