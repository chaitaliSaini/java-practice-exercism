import java.util.Random;

class DnDCharacter {
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;

    DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int ability() {
        Random randomGenerator = new Random();
        int numTrials = 4;
        int min = 7;
        int ability = 0;
        while (numTrials > 0) {
            int trialResult = randomGenerator.nextInt(6) + 1;
            ability = ability + trialResult;
            if (trialResult < min) {
                min = trialResult;
            }
            numTrials--;
        }
        ability = ability - min;
        return ability;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10.0) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(this.constitution);
    }

}
