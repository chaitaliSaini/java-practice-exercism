class Yacht {
    private int[] dice;
    private YachtCategory yachtCategory;
    private int[] diceFrequency = new int[6];
    private int diceThrows = 5;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
        for (int i = 0; i < diceThrows; i++) {
            diceFrequency[dice[i] - 1]++;
        }
    }

    int score() {
        for (int i = 1; i <= 6; i++) {
            if (YachtCategory.values()[i] == yachtCategory) {
                return diceFrequency[i - 1] * i;
            }
        }
        if (yachtCategory == YachtCategory.YACHT) {
            for (int i = 0; i < diceFrequency.length; i++) {
                if (diceFrequency[i] == 5) {
                    return 50;
                }
            }
        }
        if (yachtCategory == YachtCategory.CHOICE) {
            int totalScore = 0;
            for (int i = 0; i < dice.length; i++) {
                totalScore = totalScore + dice[i];
            }
            return totalScore;
        }
        if (yachtCategory == YachtCategory.BIG_STRAIGHT) {
            for (int i = 1; i < diceFrequency.length; i++) {
                if (diceFrequency[i] != 1) {
                    return 0;
                }
            }
            return 30;
        }
        if (yachtCategory == YachtCategory.LITTLE_STRAIGHT) {
            for (int i = 0; i < diceFrequency.length - 1; i++) {
                if (diceFrequency[i] != 1) {
                    return 0;
                }
            }
            return 30;
        }
        if (yachtCategory == YachtCategory.FOUR_OF_A_KIND) {
            for (int i = 0; i < diceFrequency.length; i++) {
                if (diceFrequency[i] >= 4) {
                    return (i + 1) * 4;
                }
            }
        }
        if (yachtCategory == YachtCategory.FULL_HOUSE) {
            int threeOfAKind = 0;
            int twoOfAKind = 0;
            for (int i = 0; i < diceFrequency.length; i++) {
                if (diceFrequency[i] == 2) {
                    twoOfAKind = i + 1;
                }
                if (diceFrequency[i] == 3) {
                    threeOfAKind = i + 1;
                }
            }
            if (twoOfAKind != 0 && threeOfAKind != 0) {
                return (2 * twoOfAKind) + (3 * threeOfAKind);
            }
        }
        return 0;
    }

}
