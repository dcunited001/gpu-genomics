package gpu_genomics;

import com.amd.aparapi.Kernel;

public class ConvertToNucleicBytes extends Kernel {
    private String nucleicData;
    private int[] nucleicBytes;

    @Override
    public void run() {

    }

    public ConvertToNucleicBytes(String nucleicData) {

    }

    public int[] result() {
        return this.nucleicBytes;
    }
}