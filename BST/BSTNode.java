public interface BSTNode {

    /*These are the nodes used in a tree */
    
    /*Returns the left child 
     * @return the left child
    */
    BSTNode getLeft();

    /*Returns the right child 
     * @return the right child
    */
    BSTNode getRight();

    /*Sets the left child 
     * @param BSTNode to be set as left child
    */
    void setLeft(BSTNode left);

    /*Sets the right child 
     * @param BSTNode to be set as right child
    */
    void setRight(BSTNode right);

    /*Returns the value of the BSTNode 
     * @return the value of the BSTNode
    */
    int getValue();

    /*Sets the value of the BSTNode 
     * @param the number to be set as value
    */
    void setValue(int val);
}
