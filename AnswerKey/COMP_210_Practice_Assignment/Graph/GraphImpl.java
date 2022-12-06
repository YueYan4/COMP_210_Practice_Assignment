package COMP_210_Practice_Assignment.Graph;
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

    /*Checks to see if a node with the same name already in the graph (no duplicates allowed) 
     * Creates the node and puts it in the HashMap
    */
    public boolean addNode(String name) {
        if(nodes.keySet().contains(name)) {
            return false;
        }
        GraphNode n = new GraphNodeImpl(name);
        nodes.put(name, n);
        return true;
    }

    /*Checks if the weight, src, or dest are invalid (negative weight, nonexistant nodes)
     * Gets the nodes from the HashMap and creates an edge using those nodes
     * If the out edge already exists in the source node, return false (no duplicate edges)
     * Else, add the edge to the list of out edges in the source node and increase the indegree of the destination node
     * Add 1 to number of edges
    */
    public boolean addEdge(String src, String dest, double weight) {
        if (weight < 0){
            return false;
        }
        if (!(nodes.keySet().contains(src)) || !(nodes.keySet().contains(dest))) {
            return false;
        }

        GraphNode s = nodes.get(src);
        GraphNode d = nodes.get(dest);
        Edge e = new EdgeImpl(s,d,weight);
        if(s.edgeExists(dest)) {
            return false;
         } 
        s.addEdge(e); 
        d.increment();
        numEdges+=1;
        return true;
    }

    
}
