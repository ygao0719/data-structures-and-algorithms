package graph;

import java.util.*;

public class Graph<T> {
    private Set<Node> nodes;
//    private Set<Edge> edges;

    public Graph(){
        nodes = new HashSet<>();
    }

    public Node addNode(T input){
        Node newNode = new Node(input);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(Node src, Node dest){
        if (nodes.contains(src) && nodes.contains(dest)){
            src.addNeighbor(dest);
            dest.addNeighbor(src);
        }
    }

    public void addEdge(Node src, Node dest,int weight){
        if (nodes.contains(src) && nodes.contains(dest)){
            src.addNeighbor(dest,weight);
            dest.addNeighbor(src,weight);
        }
    }


    public Set<Node> getNodes(){
        if (nodes.isEmpty()){
            return null;
        }else {
            return nodes;
        }
    }

    public Set<Edge> getNeighbors(Node inputNode){
        return inputNode.neighbors;
    }

    public int size(){
        return nodes.size();
    }

    public List<Node> BFS(Node node){
        if (node == null){
            throw new NullPointerException("input can not be null.");
        }

        List<Node> order = new ArrayList<>();
        Set<Node> visited = new HashSet<>();

        Queue<Node> queue = new LinkedList<>();

        visited.add(node);
        queue.add(node);

        while(queue.size() != 0){
            Node front = queue.poll();
            order.add(front);

            for(Edge neighbor :(Set<Edge>) front.neighbors){
                if (visited.add(neighbor.node)){
                    queue.add(neighbor.node);
                    visited.add(neighbor.node);
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
