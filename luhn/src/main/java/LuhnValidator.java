class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ", "");
        if (candidate.length() <= 1) {
            return false;
        }
        int sum = 0;
        int doDouble = 0;
        for (int i = candidate.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(candidate.charAt(i));
            if (doDouble == 1) {
                if (num * 2 > 9) {
                    sum = sum + (num * 2) - 9;
                } else {
                    sum = sum + (num * 2);
                }
            } else {
                sum = sum + num;
            }
            doDouble = doDouble ^ 1;
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }

}
