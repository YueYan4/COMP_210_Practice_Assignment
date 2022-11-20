package Graph;
/*Imports all of java.util, including List, ArrayList, Stack, and Map */
import java.util.*;

public interface GraphNode {

    /*These are the nodes used in a graph
     * Unlike in trees, nodes in a graph don't have children or
     * a root node
     * Instead, they have edges going to and from other nodes and a label
     * Indegree - the number of edges coming into the node
     * Outdegree - the number of edges coming out of the node
     * Note: for this assignment, a node will have a name (label), a list of out edges,
     * the indegree, and the distance/priority
    */

    /*Gets the label/name of the node
     * @return the name
    */
     public String getName();

    /*Gets the list of edges */
    public List<Edge> getEdges();
} 

