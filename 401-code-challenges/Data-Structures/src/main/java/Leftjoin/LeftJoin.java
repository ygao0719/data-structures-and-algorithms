package Leftjoin;

import java.util.HashMap;

public class LeftJoin {
    public static String[][] leftjoin(HashMap<String,String> map1, HashMap<String,String> map2){
        String[] map1Keys = map1.keySet().toArray(new String[0]);
        String[][] result = new String[map1.size()][3];

        for (int i = 0; i < map1.size(); i ++){
                result[i][0] = map1Keys[i];
                result[i][1] = map1.get(map1Keys[i]);
                if (map2.containsKey(map1Keys[i])){
                    result[i][2] = map2.get(map1Keys[i]);
                }else {
                    result[i][2] = "NULL";
                }
        }
        return result;
    }

}

