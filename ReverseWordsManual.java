public class ReverseWordsManual {

    public static String reverseWordsInSentence(String sentence) {
        // Handle null or empty strings to avoid errors
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        // 1. Split the sentence into an array of words
        String[] words = sentence.trim().split("\\s+");

        // 2. Use a StringBuilder for efficient string building
        StringBuilder reversedSentence = new StringBuilder();

        // 3. Loop through the words array backwards
        for (int i = words.length - 1; i >= 0; i--) {
            // Append the word at the current index
            reversedSentence.append(words[i]);

            // Add a space after the word, but not for the very last one
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        // 4. Convert the StringBuilder back to a final String
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String originalSentence = "I love coding";
        String reversed = reverseWordsInSentence(originalSentence);
        System.out.println("Original: \"" + originalSentence + "\"");
        System.out.println("Reversed: \"" + reversed + "\""); // Output: "coding love I"
    }
}
