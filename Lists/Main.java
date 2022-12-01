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

    }
    
}
