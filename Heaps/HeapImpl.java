public class HeapImpl implements Heap{

    private int[] elts;
    private int max;
    private int size;

    /*Define the max */
    public HeapImpl(int max) {
        this.max = max;
        this.elts = new int[max];
        size = 0;
    }

    /*Default constructor */
    public HeapImpl() {
        this.max = 100;
        this.elts = new int[max];
        size = 0;
    }

    /*Gets the heap array
     * @return the array
     */
    public int[] getHeap() {
        return this.elts;
    }
    
}
