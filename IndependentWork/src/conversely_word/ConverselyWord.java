package conversely_word;
//Write a method that rearranges words in sentences in reverse order.

public class ConverselyWord {
    public static void main(String[] args) {
        String s = "This test expression.";
        String[] words = s.split("\\s+");           //split("[\\s,.:,?!]+")
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }
}
