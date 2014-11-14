package gpu_genomics;

import com.amd.aparapi.Kernel;

public class ConvertToNucleicBytes extends Kernel {
    private string nucleicData;
    private int[] nucleicBytes;

    @Override
    public void run() {

    }

    public ConvertToNucleicBytes(string nucleicData) {

    }

    public int[] result() {
        return this.nucleicBytes;
    }
}