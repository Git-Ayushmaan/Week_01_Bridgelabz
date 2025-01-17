import java.util.Scanner;

public class ReplaceMethod {

    public static String replace(String sentence, String targetWord, String replacementWord) {
        if (sentence == null || targetWord == null || replacementWord == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        return sentence.replace(targetWord, replacementWord);
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String targetWord = "fox";
        String replacementWord = "cat";

        String result = replace(sentence, targetWord, replacementWord);
        System.out.println("Original: " + sentence);
        System.out.println("Updated: " + result);
    }
}
