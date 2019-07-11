package TreeIntersection;

import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TreeIntersection {
    public static List tree_intersection(BinaryTree a, BinaryTree b){
        List<Integer> combinedList = new ArrayList();
        List result = new ArrayList();
        Set<Integer> set = new HashSet<>();

        List lista = a.printInOrder(a.root);
        List listb = b.printInOrder(b.root);

        combinedList.addAll(lista);
        combinedList.addAll(listb);

        for( Integer num : combinedList){
            if (!set.add(num)){
                result.add(num);
            }
        }
        return result;
    }

}
