package graph;

public class Edge {
    private static final int DEFAULT_WEIGHT = 1;
    Node source;
    Node destination;
    int weight;

    Edge(Node source, Node destination){
        this(source,destination,DEFAULT_WEIGHT);
    }
    Edge(Node src, Node dest, int weig){
        this.source = src;
        this.destination = dest;
        this.weight = weig;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Edge)) return false;

        Edge _obj = (Edge) obj;
        return _obj.source.equals(source) && _obj.destination.equals(destination) &&
                _obj.weight == weight;
    }

    @Override
    public int hashCode() {
        int result = source.hashCode();
        result = 31 * result + destination.hashCode();
        result = 31 * result + weight;
        return result;
    }
}
