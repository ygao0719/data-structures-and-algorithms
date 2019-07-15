package graph;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GraphTest {

    //Node can be successfully added to the graph
    @Test
    public void addNode() {
        Graph test = new Graph();
        test.addNode(3);
        test.addNode(5);

        test.getNodes().contains(3);

    }

    //An edge can be successfully added to the graph
    @Test
    public void addEdge() {
        Graph test = new Graph();
        Node a = test.addNode(3);
        Node b = test.addNode(5);

        test.addEdge(a,b);

        assertEquals(b.value,test.getNeighbors(a).iterator().next().destination.value);

    }

    //A collection of all nodes can be properly retrieved from the graph
    @Test
    public void getNodes() {

        Graph test = new Graph();
        Node a = test.addNode(3);
        Node b = test.addNode(5);
        Node c = test.addNode(9);

        assertTrue(test.getNodes().contains(a));
        assertTrue(test.getNodes().contains(b));
        assertTrue(test.getNodes().contains(c));

    }


    //All appropriate neighbors can be retrieved from the graph
    @Test
    public void getNeighbors() {
        Graph test = new Graph();
        Node a = test.addNode(3);
        Node b = test.addNode(5);
        Node c = test.addNode(9);

        test.addEdge(a,b);
        test.addEdge(a,c);

        Iterator<Edge> it = test.getNeighbors(a).iterator();
        HashSet<Integer> hs = new HashSet<>();
        while (it.hasNext()){
                hs.add(it.next().destination.value);
        }
        HashSet<Integer> expect = new HashSet<Integer>(Arrays.asList(5,9));
        assertEquals(expect,hs);
    }

    //Neighbors are returned with the weight between nodes included
    @Test
    public void test_neighbors(){

        Graph test = new Graph();
        Node a = test.addNode(3);
        Node b = test.addNode(5);
        Node c = test.addNode(9);

        test.addEdge(a,b);
        test.addEdge(a,c);

        assertEquals(1,test.getNeighbors(a).iterator().next().weight);

    }

    //The proper size is returned, representing the number of nodes in the graph
    @Test
    public void size() {
        Graph test = new Graph();
        Node a = test.addNode(3);
        Node b = test.addNode(5);
        Node c = test.addNode(9);

        int expect = 3;
        assertEquals(expect, test.size());
    }

    //A graph with only one node and edge can be properly returned
    @Test
    public void test_onlyOne(){
        Graph test = new Graph();
        Node a = test.addNode(3);
        assertEquals(1, test.size());
        assertNull(test.getNeighbors(a));
    }

    //An empty graph properly returns null
    @Test
    public void test_empty(){
        Graph test = new Graph();
        assertEquals(0,test.size());
        assertNull(test.getNodes());
    }
}