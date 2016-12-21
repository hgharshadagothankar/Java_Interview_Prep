import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javafx.util.Pair;

public class ArrayPairSum {


public static void main(String[] args) {        

    int []a = {2,45,7,3,5,1,8,9,2,3,56,-46};
   Set<Pair> pairsSum= findAllPairs(a,10);
 //  for(int i=0;i<=pairsSum.size();i++){
   /*while(pairsSum.iterator().hasNext()){
	   System.out.println("arr"+pairsSum.iterator().next());
  }*/

}

public static void numberPairsForSum(int[] array, int sum) {
    HashSet<Integer> set = new HashSet<Integer>();
    System.out.println("HASHSET IMPL");
    for (int num : array) {
        if (set.contains(sum - num) && !(set.contains(num))) {
            String s = num + ", " + (sum - num) + " add up to " + sum;
            System.out.println(s);
        }
        set.add(num);
    }
}

@SuppressWarnings("unchecked")
public static Set<Pair> findAllPairs(int[] inputList, int sum) {
    Set<Integer> numbers = new HashSet<>(inputList.length);
    for (int num : inputList) {
        numbers.add(num);
    }

    Set<Integer> usedNumbers = new HashSet<>();
    Set<Pair> pairs = new HashSet<>();
    for (int num : inputList) {
        int pair = sum - num;
        if (numbers.contains(pair) && !usedNumbers.contains(pair)) {
            usedNumbers.add(num);
            pairs.add(new Pair(num, pair));
            System.out.println("num  "+num+"pair"+pair);
        }
    }

    return pairs;
}

}
