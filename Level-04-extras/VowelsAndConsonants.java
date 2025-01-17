class VowelsAndConsonants {

    public static void countVowelsAndConsonants(String input) {
        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        countVowelsAndConsonants(input);
    }
}