package Graph;

public interface Graph {
    
    /*A graph  is a data structure containing connected data
     * A vertex/node represents each element of the graph
     * An edge represents each relationship between two nodes
     * Directed Graph - edges have direction (a source and destination)
     * Undirected Graph - edges don't have a specified direction
     * Bidrected Graph - each end of an edge has some direction
     * Weighted Graph - edges carry a weight 
     */

    /*Add a node with the given name
     * @params name of node
     * @return false if already contains node with given name
     * @return true if success
    */
    public boolean addNode(String name);

    /*Add edge between the two nodes
     * @params names of the source and destination nodes and the weight
     * @return false if source or destination nodes do not exist
     * @return false if edge already exists between source and destination
     * @return true if success
     * Note: don't forget to update inDegree and the edgeList
    */
    public boolean addEdge(String src, String dest, double weight);
}
