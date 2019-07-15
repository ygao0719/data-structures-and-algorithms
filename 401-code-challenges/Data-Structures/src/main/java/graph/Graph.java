package graph;

import java.util.*;

public class Graph {
    private Set<Node> nodes;
    private Set<Edge> edges;
    private Map<Node,Set<Edge>> adjList;

    public Graph(){
        nodes = new HashSet<>();
        edges = new HashSet<>();
        adjList = new HashMap<>();
    }

    public Node addNode(int input){
        Node newNode = new Node(input);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(Node src, Node dest){
        Edge newEdge = new Edge(src,dest);
        edges.add(newEdge);

        adjList.putIfAbsent(src, new HashSet<>());
        adjList.putIfAbsent(dest, new HashSet<>());

        adjList.get(src).add(newEdge);
        adjList.get(dest).add(newEdge);
    }

    public Set<Node> getNodes(){
        return nodes;
    }

    public Set<Edge> getNeighbors(Node inputNode){
        if (adjList.containsKey(inputNode)){
            return adjList.get(inputNode);
        }else{
            return null;
        }
    }

    public int size(){
        return nodes.size();
    }

}
