package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    //Adding a key/value to your hashtable results in the value being in the data structure
    @Test
    public void test_add() {
        Hashtable test = new Hashtable();
        test.add("key","value");
        assertTrue(test.contains("key"));
    }

    //Retrieving based on a key returns the value stored
    @Test
    public void test_get() {
        Hashtable test = new Hashtable();
        test.add("3","");
    }

    //Successfully returns null for a key that does not exist in the hashtable
    @Test
    public void contains() {
    }

    //Successfully handle a collision within the hashtable
    @Test
    public void hash() {
    }

    //Successfully retrieve a value from a bucket within the hashtable that has a collision

    //Successfully hash a key to an in-range value
}