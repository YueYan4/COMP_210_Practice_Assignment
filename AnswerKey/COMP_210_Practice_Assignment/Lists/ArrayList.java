package COMP_210_Practice_Assignment.Lists;
public class ArrayList implements List { 

    /*Fields
    since these aren't not private, can get using name.list, name.index, and name.max
    */
    public Object [] list;
    public int index;
    public int max;


    /*List constructor
    to create an ArrayList normally: ArrayList <DataType> name = new ArrayList<>();
    to construct an ArrayList using this constructor: ArrayList name = new ArrayList();
    */
    public ArrayList() {
        list = new Object[1000000];
        index = 0;
        max = 1000000;
    }

    /*Another ArrayList constructor
     * User sets the max
     * To construct an ArrayList with 1000 as its max, use: ArrayList name = new ArrayList(1000);
    */
    public ArrayList(int max) {
        list = new Object[max];
        index = 0;
        this.max = max;
    }


    /*Note: @Override before every method you implement is a type of annotation that doesn't affect how the code runs
     * but it makes the code easier to read
     * In this assignment, it's optional but encouraged
     */
    
    public Object[] getlist() {
        return list;
    }
    /*If the list isn't full, add the object to the current index position (end of the list)
     * Increase the index position by 1
     */
    public void add(Object o) {
        if(index < max) {
            list[index] = o;
            index++;
        }
    }

    /*Create a new list
     * Add all the elements from the original list besides the one we want to remove
     * Set the list field equal to the new list
     * Update the index
     */
    public void remove(Object o) {
        Object[] newList = new Object[max];
        int k = 0;
        for(int i = 0; i < index; i++) {
            if(!list[i].equals(o)) {
                newList[k] = list[i];
                k++;
            }
        }
        index--;
        list = newList;
    }

    /*Size is the current index */
    public int size(){
        return index;
    }

    /*Loops through the list until we find the object
     * Return true if we found it
     * Return false if we exit the loop (doesn't exist)
     */
    public boolean contains(Object o) {
        for(int i = 0; i < index; i++) {
            if(list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    /*Uses ArrayList's indexing to get the object */
    public Object get(int position) {
        return list[position];
    }

    /*Reset the fields */
    public void clear() {
        index = 0;
        list = new Object[max];
    }

    /*Is size/index 0? */
    public boolean isEmpty(){
        return index == 0;
    }

    /*Loops through the list
     * Returns i if we find the object
     * Returns -1 if we exit the loop
    */
    public int indexOf(Object o) {
        for(int i = 0; i < index; i++) {
            if(list[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
}
