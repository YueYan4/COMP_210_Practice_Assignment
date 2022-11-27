
public class ArrayList implements List { 

    /*Fields
    since these aren't not private, can get using name.list, name.index, and name.max
    */
    Object [] list;
    int index;
    int max;


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
    
}
