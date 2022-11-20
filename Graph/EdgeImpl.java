package Graph;

public class EdgeImpl implements Edge {

    private GraphNode source;
    private GraphNode destination;
    private double weight;

    /*Constructor that sets everything to the given values
     * If the weight is negative, resets it to be 0
    */
    public EdgeImpl(GraphNode src, GraphNode dest, double weight) {
        this.source = src;
        this.destination = dest;
        this.weight = weight;
        if (weight < 0) {
            this.weight = 0;
        }
    }
    
}
