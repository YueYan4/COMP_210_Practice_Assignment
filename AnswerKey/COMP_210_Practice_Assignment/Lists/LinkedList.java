package COMP_210_Practice_Assignment.Lists;
public class LinkedList implements List{
    
     /*Fields
    since these aren't not private, can get using name.head, name.tail, and name.size
    */
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    /*Since we already defined the fields above, no need for a constructor
     * To construct a LinkedList normallly: LinkedList<DataType> name = new LinkedList<>();
     * To construct in this assignment: LinkedList name = new LinkedList();
     * ^ is the default constructor, every class has one
     */

    /*Note: @Override before every method you implement is a type of annotation that doesn't affect how the code runs
     * but it makes the code easier to read
     * In this assignment, it's optional but encouraged
     */

    /*For the methods, use the Node class' methods
     * Ex: Create new Nodes and set the values and next Nodes
     * Remember, LinkedLists are chains of Nodes
     * Don't forget to set the head and tail
     */

     /*If this is the only node, sets it to both the tail and the head and increases the size
      * Else, sets it as the tail node's next node and reassigns it as the new tail and increases the size
      */
    public void add(Object o) {
          Node n = new Node(o, null);
          if (isEmpty()) {
               head = n;
               tail = n;
               size++;
          }
          else {
               tail.setNext(n);
               tail = n;
               size++;
          }
     }

     public Object[] getlist() {
          return null;
     }
     /*If the list is not empty, loops through the list using temp variables curr and prev to keep track of the nodes
      * If we find the node with the object as its value, we set the previous node to be the object node's next value (skipping over it in the link)
      * If the current node/object node was the tail, sets the tail to the previous node
      * If the current node//object node was the head, sets the head to the next node
      * Updates the size and ends the loop
      * Else, update previous and current nodes
      */
     public void remove(Object o) {
          if(!isEmpty()) {
               Node curr = head;
               Node prev = null;
               while(curr.hasNext()) {
                    if(curr.getValue().equals(o)) { 
                         if(curr == this.tail) {
                              this.tail = prev;
                         }
                         else if (curr == this.head) {
                              this.head = curr.getNext();
                         } 
                         else {
                              prev.setNext(curr.getNext());
                         }
                         size--;
                         break;
                    }
                    else {
                         prev = curr;
                         curr = curr.getNext();
                    }
               }
          }
     }

     /*Gets the size */
     public int size() {
          return this.size;
     }

     /*If the list is empty, returns false
      * Loops through the list using temp variable current node
      * If the current node's value equals the object, return true
      * If we exit the loop, return falses
      */
     public boolean contains(Object o) {
          if(isEmpty()) {
               return false;
          }
          Node curr = head;
          while(curr.hasNext()) {
               if(curr.getValue().equals(o)) {
                    return true;
               }
          }
          return false;
     }


     /*Returns null if the given position is out of bounds or if the list is empty
      * Loops through the list and keeps track of an int variable to tell us when to stop the loop
      * Returns the current node's value after the loop ends 
      */
     public Object get(int position) {
          if(isEmpty()) {
               return null;
          }

          if(position < 0 || position >= size) {
               return null;
          }

          Node curr = head;
          int i = 0;
          while(i < position) {
               curr = curr.getNext();
               i++;
          }
          return curr.getValue();
     }

     /*Resets the fields */
     public void clear() {
          size = 0;
          head = null;
          tail = null;
     }

     /*Checks if size is 0 */
     public boolean isEmpty() {
          return size == 0;
     }

     /*Similar to get except the loop only ends when there's nothing left to loop through
      * And the int variable is the index variable
      * If we find the object's node, returns i
      * Else, we increase i and get the next node
      * If we exit the loop, it means the object doesn't exist in the list
      */
     public int indexOf(Object o) {
          if(isEmpty()) {
               return -1;
          }

          Node curr = head;
          int i = 0;
          while(curr.hasNext()) {
               if(curr.getValue().equals(o)) {
                    return i;
               }
               curr = curr.getNext();
               i++;
          }  
          return -1;   
     }
}

