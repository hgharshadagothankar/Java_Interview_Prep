import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javafx.util.Pair;
/*Sum ot 2 no isn array*/
public class DistinctSum {

	public DistinctSum() {
		// TODO Auto-generated constructor stub
	}
	static int numberOfPairs(int[] a, long k) {
		int pairNo=0;
		
		Set<Integer> numbers = new HashSet<>(a.length);
	    for (int num : a) {
	        numbers.add(num);
	    }

	    Set<Integer> usedNumbers = new HashSet<>();
	    Set<Pair> pairs = new HashSet<>();
	    for (int num : a) {
	        int pair = (int) (k - num);
	        if (numbers.contains(pair) /*&& !usedNumbers.contains(pair)*/) {
	            usedNumbers.add(num);
	            pairs.add(new Pair(num, pair));
	            pairNo++;
	            System.out.println("num  "+num+"pair"+pair);
	        }
	    }

	    
		
		
		return usedNumbers.size();


    }

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        /*final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));*/
        int res;
        
        int _a_size = 0;
        _a_size = in.nextInt();
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = in.nextInt();
            _a[_a_i] = _a_item;
        }
        
        long _k;
        _k = in.nextLong();
        
        res = numberOfPairs(_a, _k);
        System.out.println("res"+res);
        /*bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();*/
    }
}
