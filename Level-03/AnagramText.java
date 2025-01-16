import java.util.Scanner;

public class AnagramText {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the first text: ");
        String text1 = kb.nextLine();
        
        System.out.println("Enter the second text: ");
        String text2 =  kb.nextLine();
        
        boolean result = areAnagrams(text1, text2);
        
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        
        kb.close();
    }

    private static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] charFrequency = new int[256]; // ASCII character set

        for (char c : text1.toCharArray()) {
            charFrequency[c]++;
        }

        for (char c : text2.toCharArray()) {
            charFrequency[c]--;
        }

        for (int freq : charFrequency) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }
}
