/*Notice how this is an interface, not a class
An interface is a list of methods that must be implemented, but the implementation can differ from class to class
The purpose of an interface is to act as a contract between the implementations and the outside world, similar to the buttons in a car
Note: Java does not support multiple parent classes, but does support implementing multiple interfaces
*/
public interface List {

    /*Given an object, add it to the end of the List; assume duplicates allowed */
    public void add(Object o);

    /*Given an object, find and remove it from the List; do nothing if not in List*/
    public void remove(Object o);

    /*Get the size of the List (Hint: use fields)*/
    public int size();

    /*Checks to see if the List contains the object */
    public boolean contains(Object o);

    /*Gets the element at the position; check if the position is within the range of the list */
    public Object get(int position);

    /*Resets the size and List */
    public void clear();

    /*Checks to see if size is 0 */
    public boolean isEmpty();

    /*Finds the position of the object in the list */
    public int indexOf(Object o);
}