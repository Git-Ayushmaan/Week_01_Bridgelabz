import java.util.Scanner;

public class SplitText2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = kb.nextLine();
        String[] words = splitTextUsingCharAt(input);
        String[][] wordLengths = generateWordLengthsArray(words);

        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] wordLength : wordLengths) {
            System.out.printf("%-15s %-10d%n", wordLength[0], Integer.parseInt(wordLength[1]));
        }
        kb.close();
    }

    public static String[] splitTextUsingCharAt(String text) {
        StringBuilder word = new StringBuilder();
        java.util.ArrayList<String> words = new java.util.ArrayList<>();

        for (int i = 0; i < text.chars().count(); i++) {
            char c = text.charAt(i);
            if (c == ' ' || i == text.chars().count() - 1) {
                if (c != ' ') word.append(c);
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        return words.toArray(new String[0]);
    }

    public static int stringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] generateWordLengthsArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }
}
