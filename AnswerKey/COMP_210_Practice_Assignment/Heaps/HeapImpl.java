package COMP_210_Practice_Assignment.Heaps;
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
    }

    /*Gets the heap array
     * @return the array
    */
    public int[] getHeap() {
        return this.elts;
    }

    /*If the heap if full, return false
     * Increase the size and put the element at the end of the heap
     * Then, swap the element with its parents as need be
    */
    public void insert(int element) {
        if (this.size == this.max) {
            return; 
          }
          this.size++;
          this.elts[size] = element;  
          int idx = this.size;
          int par = idx/2;  
          while (par>0) {  
            if (this.elts[par] <= element) {
              return;  
            }
            int temp = this.elts[par];
            this.elts[par] = this.elts[idx];
            this.elts[idx] = temp;  
            idx = par;  
            par = par/2;  
          }
    }

    /*If the heap if empty, return -1
     * Else, return the first element in the heap
    */
    public int getRoot() {
        if(this.size == 0) {
            return -1;
        }
        return this.elts[0];
    }

    /*If the heap if empty, do nothing
     * Set the root to be the last element (which erases the original root) and heapify to reorder
    */
    public void extract() {
        if (this.size == 0) return;
        this.elts[1] = this.elts[this.size]; 
        this.size--;
        this.heapify(1); 
    }

    /*Get the left and right children indexes
     * Set temp variables for the current index and value
     * Check if the right child is within the range of the heap and compare with the current value
     * If the right child's value is smaller, set the current index and value variables to the right child
     * Do the same for the left child
     * If the current index variable changed, swap the elements at the current index and the base
     * Recurse on the current index
    */
    public void heapify(int base) {
        int val = this.elts[base];
        int lc = base * 2;
        int rc = base * 2 + 1;
        int currIndex = base;
        int currVal = val;

        if (rc < size + 1 && (this.elts[rc] < currVal)) {
            currIndex = rc;
            currVal = this.elts[rc];
        }
        if (lc < size + 1 && this.elts[lc] < currVal) {
            currIndex = lc;
            currVal = this.elts[lc];
        }

        if(currIndex != base) {
            int temp = this.elts[base];
            this.elts[base] = this.elts[currIndex];
            this.elts[currIndex] = temp;
            heapify(currIndex);
        }

    }
}
