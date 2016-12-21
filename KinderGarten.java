import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//import javax.sound.midi.Synthesizer;

public class KinderGarten {

	public KinderGarten() {
		// TODO Auto-generated constructor stub
	}

	
	/*private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }


        return sortedMap;
    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter no students");
		 int noStudent=in.nextInt();
		 HashMap< Integer, Integer> timeValue=new HashMap< Integer, Integer>();
		 int time[]=new int[noStudent];
		 for (int i = 0; i < noStudent; i++) {
			 System.out.println("Enter time for student["+i+"]");
			 time[i]=in.nextInt();
			 timeValue.put(i, time[i]);
		}
		 //Map<Integer, Integer> sortedMap = sortByValue(timeValue);

	}

}
