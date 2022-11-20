/*Notice how this is an interface, not a class
An interface is a list of methods that must be implemented, but the implementation can differ from class to class
The purpose of an interface is to act as a contract between the implementations and the outside world, similar to the buttons in a car
This is an example of abstraction, an Object Oriented Programming/OOP principle
Note: Java does not support multiple parent classes, but does support implementing multiple interfaces
*/
public interface List {

    /*Given an object, add it to the end of the List; assume duplicates allowed 
     * @param the Object to be added to the list
    */
    public void add(Object o);

    /*Given an object, find and remove it from the List; do nothing if not in List
     * @param the Object to be removed from the list
    */
    public void remove(Object o);

    /*Get the size of the List (Hint: use fields)
     * @return the size of the list
    */
    public int size();

    /*Checks to see if the List contains the object 
     * @param the Object to see if it exists in the list
     * @return true is the object is in the list, false if not
    */
    public boolean contains(Object o);

    /*Gets the element at the position; check if the position is within the range of the list 
     * @param the position/index
     * @return the object at the position/index
    */
    public Object get(int position);

    /*Resets the size and List */
    public void clear();

    /*Checks to see if size is 0 
     * @return true is size is 0,
    */
    public boolean isEmpty();

    /*Finds the position of the object in the list 
     * @param the Object to find 
     * @return the position/index of the object
    */
    public int indexOf(Object o);
}