package Leftjoin;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testleftjoin() {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map1.put("fond","enamored");
        map1.put("outift","grab");
        map2.put("fond","averse");
        map2.put("flow","gam");

        LeftJoin test =new LeftJoin();
        String[][] expect = {
                {"outift","grab","NULL"},
                {"fond","enamored","averse"}
        };

        assertArrayEquals(expect,test.leftjoin(map1,map2));
    }
}