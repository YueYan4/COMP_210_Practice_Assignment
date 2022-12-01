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

    /*Inserts a new node
     * Sets it as the root if the tree is empty
     * HINT: use a recursive helper method
     * If a left child is empty and the value is < the parent, put it as the left child
     * Else, call the method again on the left child
     * If a right child is empty and the value is > the parent, put is as the right child
     * Else, call the method again on the right child
     * No duplicate values
     * Don't forget to update the size
     * @params int value of the Node to add
     */
    public int insert(int val);    
}
