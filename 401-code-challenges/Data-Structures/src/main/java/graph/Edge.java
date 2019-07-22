package graph;

public class Edge<T> {
    int weight;
    Node<T> node;

    Edge(Node<T> node){
        this.node = node;
    }

    Edge(Node<T> node, int weight){
        this.node = node;
        this.weight = weight;
    }

    public Node<T> getNode(){
        return this.node;
    }

    public void setNode(Node<T> node){
        this.node = node;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
