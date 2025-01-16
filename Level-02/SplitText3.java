import java.util.Scanner;

public class SplitText3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String inputText = scanner.nextLine();
        
        // Split text into words
        String[] words = splitIntoWords(inputText);
        
        // Generate words and their lengths
        String[][] wordLengths = generateWordLengthArray(words);
        
        // Find shortest and longest words
        int[] result = findShortestAndLongestString(wordLengths);
        
        System.out.println("Shortest word: " + words[result[0]]);
        System.out.println("Longest word: " + words[result[1]]);
        
        scanner.close();
    }
    
    public static String[] splitIntoWords(String text) {
        String[] words = new String[100]; // Assumes max 100 words
        int index = 0;
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < getStringLength(text); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            words[index++] = word.toString();
        }
        
        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;
    }
    
    public static int getStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
    
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordLengths;
    }
    
    public static int[] findShortestAndLongestString(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = shortestLength;
        
        for (int i = 1; i < wordLengths.length; i++) {
            int wordLength = Integer.parseInt(wordLengths[i][1]);
            if (wordLength < shortestLength) {
                shortestLength = wordLength;
                shortestIndex = i;
            } else if (wordLength > longestLength) {
                longestLength = wordLength;
                longestIndex = i;
            }
        }
        
        return new int[]{shortestIndex, longestIndex};
    }
}
