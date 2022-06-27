package dna.app;

public class DnaResources extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {
			// Base Pairs
			{"T", "A"},
			{"A", "T"},
			{"C", "G"},
			{"G", "C"},
			// Thymine -> Uracil
			{"T", "U"},
            // UU
			{"UUU", "Phe"},
			{"UUC", "Phe"},
			{"UUA", "Leu"},
			{"UUG", "Leu"},
            // UC
			{"UCU", "Ser"},
			{"UCC", "Ser"},
			{"UCA", "Ser"},
			{"UCG", "Ser"},
            // UA
			{"UAU", "Tyr"},
			{"UAC", "Tyr"},
			{"UAA", "Stop"},
			{"UAG", "Stop"},
            // UG
			{"UGU", "Cys"},
			{"UGC", "Cys"},
			{"UGA", "Stop"},
			{"UGG", "Trp"},
			// CU
			{"CUU", "Leu"},
			{"CUC", "Leu"},
			{"CUA", "Leu"},
			{"CUG", "Leu"},
            // CC
			{"CCU", "Pro"},
			{"CCC", "Pro"},
			{"CCA", "Pro"},
			{"CCG", "Pro"},
            // CA
			{"CAU", "His"},
			{"CAC", "His"},
			{"CAA", "Gln"},
			{"CAG", "Gln"},
            // CG
			{"CGU", "Arg"},
			{"CGC", "Arg"},
			{"CGA", "Arg"},
			{"CGG", "Arg"},
            // AU
			{"AUU", "Ile"},
			{"AUC", "Ile"},
			{"AUA", "Ile"},
			{"AUG", "Met"},
            // AC
			{"ACU", "Thr"},
			{"ACC", "Thr"},
			{"ACA", "Thr"},
			{"ACG", "Thr"},
            // AA
			{"AAU", "Asn"},
			{"AAC", "Asn"},
			{"AAA", "Lys"},
			{"AAG", "Lys"},
            // AG
			{"AGU", "Ser"},
			{"AGC", "Ser"},
			{"AGA", "Arg"},
			{"AGG", "Arg"},
			// GU
			{"GUU", "Val"},
			{"GUC", "Val"},
			{"GUA", "Val"},
			{"GUG", "Val"},
            // GC
			{"GCU", "Ala"},
			{"GCC", "Ala"},
			{"GCA", "Ala"},
			{"GCG", "Ala"},
            // GA
			{"GAU", "Asp"},
			{"GAC", "Asp"},
			{"GAA", "Glu"},
			{"GAG", "Glu"},
            // GG
			{"GGU", "Gly"},
			{"GGC", "Gly"},
			{"GGA", "Gly"},
			{"GGG", "Gly"},
        };
    }
}
