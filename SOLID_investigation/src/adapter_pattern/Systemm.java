package adapter_pattern;

public class Systemm {

    private String editText;

    public Systemm(String text) {
        this.editText = removeNoDigitOrLetter(text);
    }

    public void getProcessedText(TextProcessor processor){
        processor.processTest(editText);
    }

    public String getEditText() {
        return editText;
    }

    private String removeNoDigitOrLetter(String text) {
        String[] array = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : array) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetterOrDigit(s.charAt(i)))
                    sb.append(s.charAt(i));
            }
            sb.append(" ");
        }

        return sb.toString().trim().replaceAll("( )+", " ").toLowerCase();
    }
}
