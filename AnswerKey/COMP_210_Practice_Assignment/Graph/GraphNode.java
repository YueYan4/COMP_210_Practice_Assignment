package COMP_210_Practice_Assignment.Graph;
/*Imports all of java.util, including List, ArrayList, Stack, and Map */
import java.util.*;

public interface GraphNode {

    /*These are the nodes used in a graph
     * Unlike in trees, nodes in a graph don't have children or
     * a root node
     * Instead, they have edges going to and from other nodes and a label/name
     * Indegree - the number of edges coming into the node
     * Outdegree - the number of edges coming out of the node
     * Note: for this assignment, a node will have a name (label), a list of out edges,
     * the indegree, and the distance/priority
     * Indegree will be used for topoSort and distance/priority will be used for Dijkstra's
    */

    /*Gets the label/name of the node
     * @return the name
    */
     public String getName();

    /*Gets the list of edges 
     * @return the list of edges
    */
    public List<Edge> getEdges();

    /*Gets the indegree 
     * @return the number of in edges
    */
    public int getInDegree();

    /*Increases the indegree by 1 */
    public void increment();

    /*Decreases the indegree by 1 */
    public void decrement();

    /*Adds the edge 
     * Hint: you can do it in one line
    */
    public void addEdge(Edge e);

    /*Check if the edge with the given destination exists
     * Hint: loop through the edges until the name of the destination 
     * matches the given parameter
     * Note: for each loop for edges = for(Edge e: edges)
     * @params String name of the destination node
     * @return true if the edge exists, false else
    */
    public boolean edgeExists(String destination);

    /*Removes the edge if it exists
     * Hint: call edgeExists() and loop through the edges
     * Note: ConcurrentModificationException - 
     * you can't modify a data structure (ex: deleting an element) while you're looping through it
     * @params String name of the destination node
     * @return true if successful, return false if not exist
    */
    public boolean deleteEdge(String destination);

    /*Gets the distance/priority
     * @return the distance
    */
    public double getDistance();

    /*Set the distance
     * @params the distance
    */
    public void setDistance(double distance);
} 

