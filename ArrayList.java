
public class ArrayList implements List { 

    /*List field */
    Object [] list;

    /*List constructor
    to create an ArrayList normally: ArrayList <DataType> name = new ArrayList<>();
    to construct an ArrayList using this constructor: ArrayList name = new ArrayList();
    */
    public ArrayList() {
        list = new Object[1000000];
    }
    
}
