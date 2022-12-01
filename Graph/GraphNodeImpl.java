package Graph;
/*Imports Lists */
import java.util.*;

public class GraphNodeImpl implements GraphNode {

    private String name;
    private List<Edge> edges;
    private int inDegree;
    private double distance;
    
    /*Constructor that sets everything to the initial value 
     * edges is set to a blank arraylist,
     * indegree is set to 0 (no edges connected yet)
     * distance is set to Infinity (for dijkstra's)
    */
    public GraphNodeImpl(String label) {
        this.name = label;
        this.edges = new ArrayList<>();
        this.inDegree = 0;
        this.distance = Double.MAX_VALUE;
    }

}
