public class BSTNodeImpl implements BSTNode{
    
    /*The children and the node's value will be stored as fields 
     Notice how they are set as private
     This means you can't retrieve them directly via name.left, name.right, and name.value
     This is what the get methods are for
     This is the core of encapsulation, or data hiding, another OOP principle.
     The purpose is to control and monitor changes to the data, protecting it
    */
    private BSTNode left;
    private BSTNode right;
    private int value;

    /*This constructor sets the initial left and right children and the value 
     (the setter methods gives the option to change them later)
     Note: this keyword is used to refer to the current BSTNode's fields and methods within this class
     This helps distinguish it from the parameter of the same name*/
    public BSTNodeImpl(BSTNode left, BSTNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    /*This is another constructor but without any left or right children initially
     This is a form of polymorphism (an OOP principle based on having many forms/versions of something) called constructor overloading
     where you have multiple constructors with different parameters
     This is so you can construct an object in different ways
     for many reasons, such as, in this instance, not wanting to set default/initial values to some fields
     ex: leaf nodes (don't have children)
     */
    public BSTNodeImpl(int val) {
        this.left = null;
        this.right = null;
        this.value = val;
    }

}
