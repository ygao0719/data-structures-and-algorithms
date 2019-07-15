package graph;

public class Node {
    int value;
    Node(int val){
        this.value = val;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Node)) return false;

        Node _obj = (Node) obj;
        return _obj.value == value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
