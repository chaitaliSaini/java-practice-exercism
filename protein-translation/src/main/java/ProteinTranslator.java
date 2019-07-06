import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {
    HashMap<String, String> codonProteinMapping = new HashMap<>();

    ProteinTranslator() {
        codonProteinMapping.put("AUG", "Methionine");
        codonProteinMapping.put("UUU", "Phenylalanine");
        codonProteinMapping.put("UUC", "Phenylalanine");
        codonProteinMapping.put("UUA", "Leucine");
        codonProteinMapping.put("UUG", "Leucine");
        codonProteinMapping.put("UCU", "Serine");
        codonProteinMapping.put("UCC", "Serine");
        codonProteinMapping.put("UCA", "Serine");
        codonProteinMapping.put("UCG", "Serine");
        codonProteinMapping.put("UAU", "Tyrosine");
        codonProteinMapping.put("UAC", "Tyrosine");
        codonProteinMapping.put("UGU", "Cysteine");
        codonProteinMapping.put("UGC", "Cysteine");
        codonProteinMapping.put("UGG", "Tryptophan");
        codonProteinMapping.put("UAA", "STOP");
        codonProteinMapping.put("UAG", "STOP");
        codonProteinMapping.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        for (int i = 0; i < rnaSequence.length(); i = i + 3) {
            String protein = codonProteinMapping.get(rnaSequence.substring(i, i + 3));
            if (protein == "STOP") {
                return proteins;
            }
            proteins.add(protein);
        }
        return proteins;
    }
}