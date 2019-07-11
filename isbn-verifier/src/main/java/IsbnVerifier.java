class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int answer = 0;
        int multiplyWith = 10;
        int i = 0;
        while (i < stringToVerify.length() && multiplyWith != 0) {
            if (stringToVerify.charAt(i) == 'X' && i == stringToVerify.length() - 1) {
                answer = answer + 10;
                multiplyWith--;
            }
            if ((int) stringToVerify.charAt(i) >= 48 && (int) stringToVerify.charAt(i) <= 57) {
                answer = answer + (((int) stringToVerify.charAt(i) - 48) * multiplyWith);
                multiplyWith--;
            }
            i++;
        }

        if (answer % 11 == 0 && stringToVerify != "" && multiplyWith == 0 && i == stringToVerify.length()) {
            return true;
        }
        return false;
    }

}
