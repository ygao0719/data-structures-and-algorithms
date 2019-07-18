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
        if (nodes.isEmpty()){
            return null;
        }else {
            return nodes;
        }
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

    public List<Integer> BFS(Node node){
        List<Integer> order = new ArrayList<>();
        boolean visited[] = new boolean[nodes.size()];

        LinkedList<Node> queue = new LinkedList<>();

        visited[node.value] = true;
        queue.add(node);

        while(queue.size() != 0){
            Node front = queue.poll();
            order.add(front.value);

            Iterator<Edge> it = adjList.get(front).iterator();
            while(it.hasNext()){
                Node n = it.next().destination;
                if (!visited[n.value]){
                    visited[n.value] = true;
                    queue.add(n);
                }
            }
        }
        return order;
    }

    public String getEdge(Node[] arr){
        if (arr.length > nodes.size()||arr.length < 2){
            throw new IllegalArgumentException("wrong input");
        }

        int total = 0;
        for (int i = 0;i < arr.length-1; i++) {

            int j = i + 1;
            Edge newEdge = new Edge(arr[i],arr[j]);

            if (edges.contains(newEdge)){
                total = total + newEdge.weight;
            }else{
                break;
            }
        }

        if (total == 0){
            return "false " + 0;
        }else{
            return "true " + total;
        }
    }

    public List<Integer> DFS(Node node){
        List<Integer> order = new ArrayList<>();
        boolean visited[] = new boolean[nodes.size()];

        Stack<Node> stack = new Stack<>();

        visited[node.value] = true;
        stack.add(node);

        while(stack.size() != 0){
            Node front = stack.pop();
            order.add(front.value);

            Iterator<Edge> it = adjList.get(front).iterator();
            while(it.hasNext()){
                Node n = it.next().destination;
                if (!visited[n.value]){
                    visited[n.value] = true;
                    stack.add(n);
                }
            }
        }
        return order;
    }

}
