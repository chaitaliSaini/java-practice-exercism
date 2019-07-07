import java.util.HashMap;

class RnaTranscription {
    HashMap<Character, Character> rnaMapping = new HashMap<>();

    RnaTranscription() {
        rnaMapping.put('G', 'C');
        rnaMapping.put('C', 'G');
        rnaMapping.put('T', 'A');
        rnaMapping.put('A', 'U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            rna.append(rnaMapping.get(dnaStrand.charAt(i)));
        }
        return rna.toString();
    }

}
