# gpu-genomics

I want to experiment with optimizing some of the algorithms I've learned in my Coursera Bioinformatics class.
I've heard about using CUDA C to access the GPU for massively parallel computations, but I wanted to do
something similar with Clojure.  I found the aparapi-matrix lib, which provides good examples of using Java's
aparapi lib to interface with OpenCL, via clojure.

I'm in the very beginning of trying this out, but I think I'll be able to optimize hamming distance and other functions
by using a byte comparison algorithm.  At first I want to write this for the bases ACGT(2-bit space), then try reworking it for
Amino Acids(64-bit space).  After that, I want to see if I can parallel the algorithm for computing the Neighborhood
of a string.  Again, first ACGT, then with Aminos.

## Usage

1. You'll need to download the Aparapi Project and JAR from [Google Code](https://code.google.com/p/aparapi/).
1. You'll need to put it in your `/opt/` folder or update the paths in `project.clj`.
1. And you'll likely need to run `lein uberjar` and `lein run` before running `lein repl`.  Use `lein run` to run the code in main.