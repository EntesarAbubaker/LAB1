public class Q15 {
    public class Q15 {
        public static void countVowels(String word) {
            if (word == null) {
                System.out.println("The word is null!!!");
                return;
            }

            String[] vowels = {"a", "e", "i", "o", "u"};
            int count = 0;
            String str = word.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                for (String vowel : vowels) {
                    if (vowel.charAt(0) == currentChar) {
                        count++;
                        break;
                    }
                }
            }

            System.out.println("Number of vowels in the word \"" + word + "\": " + count);
        }

        public static void main(String[] args) {
            countVowels("Entesar");
            countVowels(null);

        }
    }

}
