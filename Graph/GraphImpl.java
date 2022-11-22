package Graph;
import java.util.*;

public class GraphImpl implements Graph {

    /*How we will store the nodes
     * Map uses key, value pairs and is unordered
     * map.keySet() = gets the keys (in this case the strings)
     * map.values() = gets the values (in this case nodes)
     * map.containsKey() = checks if the key exists
     * map.entrySet() = gets each key,value pair
     * map.get(key) = gets the value paired with the key
     */
    private Map<String, GraphNode> nodes;
    private int numEdges;

    public GraphImpl() {
        this.nodes = new HashMap<>();
        this.numEdges = 0;
    }
    
}
