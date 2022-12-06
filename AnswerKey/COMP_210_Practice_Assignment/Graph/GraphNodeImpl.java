package COMP_210_Practice_Assignment.Graph;
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

    /*Simple get and set methods */
    public List<Edge> getEdges() {
        return edges;
    }

    public int getInDegree() {
        return inDegree;
    }

    public void increment() {
        inDegree++;
    }

    public void decrement() {
        inDegree--;
    }

    public String getName() {
        return name;
    }


    public void addEdge(Edge e) {
        edges.add(e);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    /*Checks if the outgoing edge to the given destination node exists
     * Loops through the edge list
     * If the current edge's destination node's name matches the one we're looking for, return true
     * If we get to the end of the loop without having returned true, return false
    */
    public boolean edgeExists(String dest) {
        for(Edge e: edges) {
            if (e.getDestination().getName().equals(dest)) {
                return true;
            }
        }
        return false;
    }

    /*First check if the edge with the given node exists
     * If it does, set a temp variable to null, loop through the edge list until you found the edge with the given destination node
     * Set the temp var to the edge with the given destination node
     * Remove from the list if the temp variable is not null
     * Note: if we remove the edge directly in the for loop, we get a ConcurrentModificationException
     * since we are changing the edge list as we iterate through it
    */
    public boolean deleteEdge(String dest) {
        if(edgeExists(dest)) {
            Edge toRemove = null;
            for(Edge e: edges) {
                if(Objects.equals(e.getDestination().getName(), dest)) {
                    toRemove = e;
                    break;
                }
            }
            if(toRemove == null) return false;
            edges.remove(toRemove);
            return true;
        }
        return false;
    }

    





}
