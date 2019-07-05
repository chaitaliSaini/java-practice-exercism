class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase.toLowerCase();
    }

    String get() {
        boolean newWord = false;
        StringBuilder acronym = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0) {
                acronym.append(phrase.charAt(i));
            } else if (phrase.charAt(i) == ' ' || phrase.charAt(i) == '_' || phrase.charAt(i) == '-') {
                newWord = true;
            } else if (newWord == true && (phrase.charAt(i) >= 97 && phrase.charAt(i) <= 122)) {
                acronym.append(phrase.charAt(i));
                newWord = false;
            }
        }
        return acronym.toString().toUpperCase();
    }

}
