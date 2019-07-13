class LargestSeriesProductCalculator {
    private String stringNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        if (!inputNumber.matches("[0-9]*")) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.stringNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if (stringNumber.length() < numberOfDigits) {
            throw new IllegalArgumentException(
                    "Series length must be less than or equal to the length of the string to search.");
        }
        if (stringNumber.length() == 0 || numberOfDigits == 0) {
            return 1;
        }
        long product = 1;
        long maxProduct = 0;
        int startIndex = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) == '0') {
                product = 0;
                startIndex = 0;
            } else {
                if (startIndex == 0 && i >= numberOfDigits) {
                    startIndex = i;
                    product = stringNumber.charAt(i) - '0';
                } else if (i - startIndex == numberOfDigits) {
                    product = product * (stringNumber.charAt(i) - '0');
                    product = product / (stringNumber.charAt(startIndex) - '0');
                    startIndex++;
                } else {
                    product = product * (stringNumber.charAt(i) - '0');
                }
            }
            if (product > maxProduct && i - startIndex == numberOfDigits - 1) {
                maxProduct = product;
            }
        }
        return maxProduct;
    }

}
