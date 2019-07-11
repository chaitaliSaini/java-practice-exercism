class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < words.length - 1; i++) {
            ans.append(String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]));
        }
        if (words.length >= 1) {
            ans.append(String.format("And all for the want of a %s.", words[0]));
        }
        return ans.toString();
    }

}
