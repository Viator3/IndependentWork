package conversely_word;
/* Write a method that rearranges words in sentences in reverse order.
1. The method must take a value and return the result.
2. It is necessary to rearrange words in sentences, that is, the sequence of the following
sentences should be preserved.
 */
public class ConverselyWord2 {
    public static void main(String[] args) {
        String text = "We write the check offer. Let's try to offer an exclamation point!"
                + " Try to learn something? Well, let us introduce some kind of address,"
                + " such as github.com.";
        text += " ";
        System.out.println(revertWordsInText(text));
    }

    public static StringBuilder revertWordsInText(String text) {
        StringBuilder sb = new StringBuilder();
        String[] expression = text.split("[\\.?!]+\\s");
        for (int i = 0; i < expression.length; i++) {
            String[] expressionConversely = expression[i].split("\\s");
            for (int j = expressionConversely.length - 1; j >= 0; j--) {
                if (j == 0) {
                    sb.append(expressionConversely[j]);
                } else {
                    sb.append(expressionConversely[j] + " ");
                }
            }
            sb.append(". ");
        }
        return sb;
    }
}
