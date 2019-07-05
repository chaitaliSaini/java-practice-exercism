import java.util.HashMap;

class Scrabble {
    private String word;
    private HashMap<Character, Integer> characterScoreMap = new HashMap<>();

    Scrabble(String word) {
        this.word = word.toLowerCase();
        characterScoreMap.put('a', 1);
        characterScoreMap.put('b', 3);
        characterScoreMap.put('c', 3);
        characterScoreMap.put('d', 2);
        characterScoreMap.put('e', 1);
        characterScoreMap.put('f', 4);
        characterScoreMap.put('g', 2);
        characterScoreMap.put('h', 4);
        characterScoreMap.put('i', 1);
        characterScoreMap.put('j', 8);
        characterScoreMap.put('k', 5);
        characterScoreMap.put('l', 1);
        characterScoreMap.put('m', 3);
        characterScoreMap.put('n', 1);
        characterScoreMap.put('o', 1);
        characterScoreMap.put('p', 3);
        characterScoreMap.put('q', 10);
        characterScoreMap.put('r', 1);
        characterScoreMap.put('s', 1);
        characterScoreMap.put('t', 1);
        characterScoreMap.put('u', 1);
        characterScoreMap.put('v', 4);
        characterScoreMap.put('w', 4);
        characterScoreMap.put('x', 8);
        characterScoreMap.put('y', 4);
        characterScoreMap.put('z', 10);
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score = score + characterScoreMap.get(word.charAt(i));
        }
        return score;
    }

}
