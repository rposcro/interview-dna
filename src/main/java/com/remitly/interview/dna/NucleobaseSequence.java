package com.remitly.interview.dna;

public class NucleobaseSequence {

    private Nucleobase[] nucleobases;

    public NucleobaseSequence(Nucleobase... nucleobases) {
        this.nucleobases = nucleobases;
    }

    public Nucleobase[] asArray() {
        return this.nucleobases;
    }
}
