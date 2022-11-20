
public class ArrayList implements List { 

    /*List field
    since it's not private, can get using name.list;
    */
    Object [] list;

    /*List constructor
    to create an ArrayList normally: ArrayList <DataType> name = new ArrayList<>();
    to construct an ArrayList using this constructor: ArrayList name = new ArrayList();
    */
    public ArrayList() {
        list = new Object[1000000];
    }

    /*Note: @Override before every method you implement is a type of annotation that doesn't affect how the code runs
     * but it makes the code easier to read
     * In this assignment, it's optional but encouraged
     */
    
}
