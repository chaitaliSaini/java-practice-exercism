class RaindropConverter {

    String convert(int number) {
        StringBuilder answer = new StringBuilder();
        boolean answerNotNull = false;
        if (number % 3 == 0) {
            answer.append("Pling");
            answerNotNull = true;
        }
        if (number % 5 == 0) {
            answer.append("Plang");
            answerNotNull = true;
        }
        if (number % 7 == 0) {
            answer.append("Plong");
            answerNotNull = true;
        }
        if (!answerNotNull) {
            return Integer.toString(number);
        }
        return answer.toString();
    }

}
