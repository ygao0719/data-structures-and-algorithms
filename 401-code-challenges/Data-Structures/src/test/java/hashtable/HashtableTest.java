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
        test.add("3","Kent");
        String expect = "Kent";
        assertEquals(expect, test.get("3"));
    }

    //Successfully returns null for a key that does not exist in the hashtable
    @Test
    public void test_null() {
        Hashtable test = new Hashtable();
        test.add("3","Kent");
        assertNull(test.get("1"));
    }

    //Successfully handle a collision within the hashtable
    //Ben and Khalil have the same hash key
    @Test
    public void test_collision() {

        Hashtable test = new Hashtable();
        test.add("Ben", "student");
        test.add("Khalil", "boss");
        assertEquals(test.hash("Ben"), test.hash("Khalil"));

    }

    //Successfully retrieve a value from a bucket within the hashtable that has a collision
    @Test
    public void test_retrieve(){
        Hashtable test = new Hashtable();
        test.add("Ben", "student");
        test.add("Khalil", "boss");
        String expect = "student";
        assertEquals(expect, test.get("Ben"));
    }

    //Successfully hash a key to an in-range value
    @Test
    public void test_hash(){
        Hashtable test = new Hashtable();
        int key = test.hash("ben");
        assertTrue( key < 16);
    }
}