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
    
}
