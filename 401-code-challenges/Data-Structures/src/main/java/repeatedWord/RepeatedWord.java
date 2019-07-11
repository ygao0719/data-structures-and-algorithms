package repeatedWord;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {
    public static String duplicateWords(String input){
        if (input == null || input.isEmpty()){
            return null;
        }

        String[] words = input.split(" " );
        Set<String> set = new HashSet<>();

        for(String word : words){
            if(!set.add(word)){
                return word;
            }
        }
        return null;
    }
}
