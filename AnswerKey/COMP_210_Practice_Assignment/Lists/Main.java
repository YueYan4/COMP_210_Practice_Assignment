package COMP_210_Practice_Assignment.Lists;
/*Create Main.java in each folder to test your code */
public class Main {
    public static void main(String args[]) {
        ArrayList arr = new ArrayList();
        arr.add("hi");
        arr.add(12);
        arr.add(true);
        /*Should print out "hi" 12 true */
        for(int i = 0; i < 3; i++) {
            System.out.println(arr.list[i]);
        }
        arr.remove(12);
        /*Should print out "hi" true */
        for(int i = 0; i < 2; i++) {
            System.out.println(arr.list[i]);
        }
        /*Should print out 2 */
        System.out.println(arr.size());
        System.out.println("------------");

        LinkedList l = new LinkedList();
        l.add(12);
        l.add("hi");
        l.add(true);

        /*Should print out the same as ArrayList */
        Node curr = l.head;
        while(curr.hasNext()){
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }
        System.out.println(curr.getValue());
        System.out.println(l.size());
        l.remove(12);
        Node c = l.head;
        while(c.hasNext()) {
            System.out.println(c.getValue());
            c = c.getNext();
        }
        System.out.println(c.getValue());
        System.out.println(l.size());



    }
    
}
