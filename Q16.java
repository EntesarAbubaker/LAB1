public class Q16 {
    public static String removePunctuation(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "Let’s try, Mike!";
        String cleanSentence = removePunctuation(sentence);
        System.out.println(cleanSentence);
    }
}
