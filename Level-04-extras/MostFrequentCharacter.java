import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success";

        // Create a frequency map for characters
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the most frequent character
        char mostFrequentChar = input.charAt(0);
        int maxFrequency = 0;
        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) > maxFrequency) {
                mostFrequentChar = c;
                maxFrequency = frequencyMap.get(c);
            }
        }

        // Print the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
