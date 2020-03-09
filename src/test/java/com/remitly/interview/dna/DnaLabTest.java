package com.remitly.interview.dna;

import org.junit.Assert;
import org.junit.Test;

import static com.remitly.interview.dna.Nucleobase.*;

public class DnaLabTest {

    private DnaLab dnaLab;

    private void setup() {
        dnaLab = new DnaLab(new NucleobaseSequence(
            ADENINE, THYMINE, THYMINE, CYTOSINE, ADENINE, GUANINE
        ));
    }

    @Test
    void canBeComplimentary() {
        Assert.assertTrue(dnaLab.canBeComplimentary(
            new NucleobaseSequence(THYMINE),
            new NucleobaseSequence(CYTOSINE, ADENINE, GUANINE),
            new NucleobaseSequence(ADENINE, THYMINE)
        ));
    }
}
