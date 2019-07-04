class ReverseString {

    String reverse(String inputString) {
        StringBuilder reverseInput = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseInput.append(inputString.charAt(i));
        }
        return reverseInput.toString();
    }

}