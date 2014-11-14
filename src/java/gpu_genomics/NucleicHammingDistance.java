package gpu_genomics;

import com.amd.aparapi.Kernel;

public class NucleicHammingDistance extends Kernel {
    private float foo;
    private float bar;

    @Override
    public void run() {

    }

    // takes a 2 converted strings of genomic data
    // - genome is the data to search
    // - kmer is the converted string to compare against
    // - strings are converted to a format with 2 bits representing each base
    // returns an array of integers, representing the hamming distance for each index
    public NucleicHammingDistance(float foo, float bar) {

    }

    public float result() {
        return this.foo;
    }
}