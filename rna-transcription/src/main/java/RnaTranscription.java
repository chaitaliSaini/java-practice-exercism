class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'A') {
                rna.append('U');
            } else if (dnaStrand.charAt(i) == 'T') {
                rna.append('A');
            } else if (dnaStrand.charAt(i) == 'G') {
                rna.append('C');
            } else {
                rna.append('G');
            }
        }
        return rna.toString();
    }

}
