package COMP_210_Practice_Assignment.BST;

public class BSTImpl implements BST{

    private BSTNode root;
    private int size;

    /*This constructor creates an empty BST */
    public BSTImpl() {
        this.root = null;
        this.size = 0;
    }

    /*This constructor creates a BST with a root
     * Note: we cannot use BSTNode() as it is an interface and cannot be constructed
     * so we use BSTNodeImpl()
     * BSTNode name = new BSTNodeImpl() is also valid as it defines the object as a BSTNode, 
     * meaning it has access to the interface's methods but is constructed as a BSTNodeImpl(),
     * which is class
     */
    public BSTImpl(int val) {
        this.root = new BSTNodeImpl(val);
    }

    /*Simple get methods */
    public BSTNode getRoot() {
        return this.root;
    }
    
    public int size() {
        return this.size;
    }

    /*If the tree is empty, sets the root to a new node and updates the size
     * Else, calls the recursive helper method on the root
     */
    public int insert(int val) {
        if(root == null) {
            root = new BSTNodeImpl(val);
            this.size = 1;
            return val;
        }
        return insert_r(val, this.root);
    }

    /*The recursive helper function
     * If the current value is equal to the value we're trying to add, returns the value (no duplicates)
     * If the value we're trying to add is less than the current value and the left child of the current node is empty,
     * set the left child as a new node and update the size
     * If the left child is not empty, climb down the tree on the left by calling the function on it
     * Same for the right
     */
    private int insert_r(int val, BSTNode curr) {
        if(curr.getValue() == val) {
            return curr.getValue();
        }
        else if (val < curr.getValue()) {
            if(curr.getLeft() == null) {
                curr.setLeft(new BSTNodeImpl(val));
                this.size++;
                return val;
            }
            else {
                return insert_r(val, curr.getLeft());
            }
        }
        else {
            if(curr.getRight() == null) {
                curr.setRight(new BSTNodeImpl(val));
                this.size++;
                return val;
            }
            else {
                return insert_r(val, curr.getRight());
            }
        }

    }
}
