public class HeapImpl implements Heap{

    private int[] elts;
    private int max;

    /*Define the max */
    public HeapImpl(int max) {
        this.max = max;
        this.elts = new int[max];
    }

    /*Default constructor */
    public HeapImpl() {
        this.max = 100;
        this.elts = new int[max];
    }

    /*Gets the heap array
     * @return the array
     */
    public int[] getHeap() {
        return this.elts;
    }
    
}
