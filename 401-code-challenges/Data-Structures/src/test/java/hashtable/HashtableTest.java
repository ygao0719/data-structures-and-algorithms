package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void add() {
        Hashtable test = new Hashtable();
        test.add("key","value");
        assertTrue(test.contains("key"));
    }

    @Test
    public void get() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void hash() {
    }
}