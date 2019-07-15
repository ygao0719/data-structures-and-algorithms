package Leftjoin;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    //happy path
    @Test
    public void testleftjoin() {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map1.put("fond", "enamored");
        map1.put("outift", "grab");
        map2.put("fond", "averse");
        map2.put("flow", "gam");

        LeftJoin test = new LeftJoin();
        String[][] expect = {
                {"outift", "grab", "NULL"},
                {"fond", "enamored", "averse"}
        };

        assertArrayEquals(expect, test.leftjoin(map1, map2));
    }

    //if right hashmap is empty
    @Test
    public void test_rightEmpty() {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map1.put("fond", "enamored");
        map1.put("outift", "grab");

        LeftJoin test = new LeftJoin();
        String[][] expect = {
                {"outift", "grab", "NULL"},
                {"fond", "enamored", "NULL"}
        };

        assertArrayEquals(expect, test.leftjoin(map1, map2));
    }

    //if left hashmap is empty
    @Test
    public void test_leftEmpty() {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map2.put("fond", "enamored");
        map2.put("outift", "grab");

        LeftJoin test = new LeftJoin();
        String[][] expect = {};
        assertArrayEquals(expect, test.leftjoin(map1, map2));
    }
}
