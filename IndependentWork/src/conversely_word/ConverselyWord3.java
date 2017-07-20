package conversely_word;

import java.util.*;
import java.util.regex.*;

/* Write a method that rearranges words in sentences in reverse order.
1. The method must take a value and return the result.
2. It is necessary to rearrange words in sentences, that is, the sequence of the following sentences should be preserved.
3. The sign should be left at the end of the sentence.
*/
public class ConverselyWord3 {
    public static void main(String[] args) {
        String text = "We write the check offer. Let's try to offer an exclamation point!"
                + " Try to learn something? Well, let us introduce some kind of address,"
                + " such as github.com.";

        System.out.println(revertWords(splitTextOnSentences(text)));
    }

    public static ArrayList<String> splitTextOnSentences(String text) {
        Pattern re = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)",
                Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher reMatcher = re.matcher(text);
        ArrayList<String> sentences = new ArrayList<>();

        while (reMatcher.find()) {
            sentences.add(reMatcher.group());
        }
        return sentences;
    }

    public static String revertWords(ArrayList<String> splitTextOnSentences) {
        StringBuilder collectText = new StringBuilder();

        for (String sentences : splitTextOnSentences) {
            String[] expression = sentences.substring(0 , sentences.length() - 1).split("\\s");
            String sign = sentences.substring(sentences.length() - 1, sentences.length());

            for (int indexWord = 0; indexWord < expression.length; indexWord++) {
                if (indexWord == expression.length - 1) {
                    collectText.append(expression[expression.length - 1 - indexWord]);
                } else {
                    collectText.append(expression[expression.length - 1 - indexWord] + " ");
                }
            }
            collectText.append(sign + " ");
        }
        return collectText.toString();
    }
}
