class NaturalNumber {
    private int number;

    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        if (number == 1) {
            return Classification.DEFICIENT;
        }
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (i * i == number || i == 1) {
                sum = sum + i;
            } else if (number % i == 0) {
                sum = sum + i;
                sum = sum + (number / i);
            }
        }
        if (sum == number) {
            return Classification.PERFECT;
        } else if (sum > number) {
            return Classification.ABUNDANT;
        }
        return Classification.DEFICIENT;
    }

}
