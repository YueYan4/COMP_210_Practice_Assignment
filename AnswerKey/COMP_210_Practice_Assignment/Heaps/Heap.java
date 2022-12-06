package COMP_210_Practice_Assignment.Heaps;
public interface Heap {
    
    /*A heap is a complete bindary tree that is arranged in a specific order
     * Min heaps have the smallest element at the top/root 
     * Every child is greater than their parents 
     * Ex:1 is the parent of 2 and 3 and 2 is the parent of 4 and 5
     * 
     * Max heaps have the greatest element at the top/root
     * Every child is less than their parents
     * Ex: 5 is the parent of 4 and 3 and 3 is the parent of 1 and 2 
     * 
     * Sibling order (within the level) doesn't matter
     * 
     * Note: for this assignment, the heap will be represented as an array of ints
     * Note: for now, we will only implement the min heap
     * 
    */

    public int[] getHeap();

    /*Insert the element at the correct order
      * Fails is the heap is full and duplicates are allowed
      * Hint: you won't use heapify (since the tree is already heapified)
      * You would only swap until it's in the right place
      * HINT: the index of the left child is 2 * index, the index of the right child is 2 * index + 1, and the index of the parent is index/2
     * @param the int element
    */
    public void insert(int element);

    /*Gets the root of the heap (min)
     * @return the root
    */
    public int getRoot();

    /*Removes the root and reorders the rest to maintain heap property*/
    public void extract();

    /*Heapify - method used to maintain heap property
     * Hint: get the index of left and right children, find the smallest among the 2 children and the parent
     * If not the parent, swap parent and smallest child, recurse on the smallest child's index (originally the parent node)
     * Hint: left child = 2 * base (if root is index 1),
     * right child = 2 * base + 1 (if root is index 1),
     * parent = base/2 (if root is index 1)
     * @params the base to start heapifying at
    */
    public void heapify(int base);
}
