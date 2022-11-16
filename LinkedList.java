public class LinkedList implements List{
    
    /*List field */
    Object [] list;

    /*List constructor
    to create a LinkedList normally: LinkedList <DataType> name = new LinkedList<>();
    to construct a LinkedList using this constructor: LinkedList name = new LinkedList();
    */
    public LinkedList() {
        list = new Object[1000000];
    }

}

