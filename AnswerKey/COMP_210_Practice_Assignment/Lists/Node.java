package COMP_210_Practice_Assignment.Lists;
public class Node {

    /*Nodes used in LinkedLists
     * Can contain any value
    */

    /*Due to the simplicity of this class, this is filled out for you */
    
    /*Value and next fields */
    private Object value;
    private Node next;

    /*Constructor to set the fields */
    public Node(Object val, Node n) {
        this.value = val;
        this.next = n;
    }

    /*Sees if there is a next Node/if this node is the tail
     * @return true if not the tail, false if it is
    */
    public boolean hasNext() {
        return this.next != null;
    }

    /*Gets the value
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /*Sets the value
     * @params the new value
     */
    public void setValue(Object v) {
        value = v;
    }

    /*Gets the next Node 
     * @return the next node
    */
    public Node getNext() {
        return next;
    }

    /*Sets the next node
     * @params the new next node
     */
    public void setNext(Node n) {
        next = n;
    }
}
