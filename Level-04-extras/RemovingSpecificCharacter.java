public class RemovingSpecificCharacter {
    
    public static void main(String[] args) {
        String str = "Hello World";
        char charToRemove = 'l';
        String result = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + result);
    }

    public static String removeCharacter(String str, char charToRemove) {
        return str.replace(Character.toString(charToRemove), "");
    }
}
