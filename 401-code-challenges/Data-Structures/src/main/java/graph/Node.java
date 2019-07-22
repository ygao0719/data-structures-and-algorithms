package graph;

import java.util.HashSet;
import java.util.Set;

public class Node<T> {
    T value;
    public Set<Edge> neighbors;

    Node(T val){
        this.value = val;
        this.neighbors = new HashSet<>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    //add new neighbor to current node
    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        return true;
    }

    //add new neighbor to current node with weight
    public boolean addNeighbor(Node<T> node, int weight){
        Edge edge = new Edge(node, weight);
        this.neighbors.add(edge);
        return true;
    }

    public String toString(){
        return this.value.toString();
    }

    //helpper function for getEdge
    public int getCost(Node dest){
        for (Edge edge : this.neighbors){
            if (edge.node.equals(dest)){
                return edge.weight;
            }
        }
        return 0;
    }
}
