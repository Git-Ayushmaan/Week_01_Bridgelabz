import java.util.Scanner;

public class CheckEquals {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = kb.next();
        System.out.print("Enter the second string: ");
        String str2 = kb.next();
        
        // Compare strings using charAt() method
        boolean charAtComparison = compareUsingCharAt(str1, str2);

        // Compare strings using String.equals() method
        boolean equalsComparison = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt(): "+ charAtComparison);
        System.out.println("Comparison using equals(): "+ equalsComparison);
        System.out.println("Are the results the same? "+ (charAtComparison == equalsComparison));
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

