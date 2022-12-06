package COMP_210_Practice_Assignment.Graph;
public interface Edge {
    
    /*An edge is what connects the nodes of a graph 
     * Each edge in a directed graph has a source node and a destination node
     * Each edge in a weighted graph has a weight
     * Each edge in an undirected graph has two nodes that both act as the source and destination
     * Meaning we can go in either direction
     * For this assignment, we will be working on a directed and weighted graph
    */

    /*Gets the source node
     * @return the node at the source
    */
    public GraphNode getSource();

    /*Gets the destination node
     * @return the node at the destination
    */
    public GraphNode getDestination();

    /*Gets the weight
     * @return the weight
    */
    public double getWeight();
}
