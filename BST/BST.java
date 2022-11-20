public interface BST {

    /*A binary search tree/BST is a binary (max 2 child nodes) 
    tree (single direction, nonlinear, recursive, data structure)
    with all the left children being less than their parents 
    and the right children being more than their parents.
    Every child is also a BST
    Note: for this class, assume no duplicate values
    */


    /*Returns the root of the tree
     * @return the root
     */
    public BSTNode getRoot();

    /*Gets the size of the tree
     * @return the number of nodes
     */
    public int size();

    /*Gets the longest path from the root to a leaf
     * HINT: use recursive helper method; remember: every child is another BST
     * with its own height
     * @return the height 
     */
    public int height();
    
    /*Sees if the given value is in the tree
     * HINT: Use a recursive helper method; start at the root and go down each path
     * @param the value to find
     * @return true if the value is in the tree, false else
     */
    public boolean contains(int val);

    /*Removes the node with the given values (if it exists) 
     * HINT: use recursion; remember tha left < parent and right > parent
     * use the BSTNode's set and get methods
     * @param value to remove
    */
    public void remove(int val);
}
