public class Palindrome {
    public boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
