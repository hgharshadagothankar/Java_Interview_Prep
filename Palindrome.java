import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

import sun.security.util.Length;

public class Palindrome {


	public static String electionWinner(String[] votes) {

		Map<String, Integer> occurences = new HashMap<String, Integer>();
		for(String index:votes){
			if(occurences.containsKey(index)){
				
				occurences.put(index, occurences.get(index)+1);
				
			}
			else
			{
				occurences.put(index,1);
			}
			
		}

		Set<String> charsInString = occurences.keySet();
		Set<String> countgreater=new HashSet<String>();
		//String[] b=new String[charsInString.size()];
       System.out.println("charsInString"+charsInString.size()+"occurences"+occurences.size());
		for(String s:charsInString){
			if(occurences.get(s) > 1){ 
				countgreater.add(s);
				}
			}
		
		int maxlenght=0;
		System.out.println("b lenght"+countgreater.size());
		Map<String, Integer> lenghtcheck = new HashMap<String, Integer>();
		for(String index:countgreater){
			if(index.length() > maxlenght){
				System.out.println("cb[index]"+index+"maxlenght"+maxlenght);
				maxlenght=index.length();
				lenghtcheck.put(index, index.length());
			}
		}
		
		Set<String> countInString = lenghtcheck.keySet();
		String winner=null;
		System.out.println("countInString"+countInString);
		for(String s:countInString){
			System.out.println("lenght chekc"+lenghtcheck.get(s)+"maxlenght"+maxlenght);
		if(lenghtcheck.get(s)==maxlenght){
			winner=s;
		}
		else{
		/*Arrays.sort(lenghtcheck);
		winner= b[b.length-1];*/
		}
		}
		System.out.println("winner"+winner); 

		return winner;
	}

	public static void main(String[] args) {
		
		String a[]=new String[]{"alex","veronica","wity","harshdaa","veronica","harshdaaxxxxxxx","harshdaaxxxxxxx","harshdaa","hdrshdaaxxxxxxx","hdrshdaaxxxxxxx"};

		electionWinner(a);

	}
}
