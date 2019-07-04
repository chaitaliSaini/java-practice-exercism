public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] array = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            if ((int) input.charAt(i) >= 97 && (int) input.charAt(i) <= 122) {
                array[(int) input.charAt(i) - 97] = true;
            }
        }
        for (boolean i : array) {
            if (!i) {
                return false;
            }
        }
        return true;
    }

}
