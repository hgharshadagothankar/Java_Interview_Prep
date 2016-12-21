import java.util.HashSet;
import java.util.Scanner;

public class Panagrams {

	public Panagrams() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String inputString=sc.nextLine();
		inputString=inputString.toLowerCase();
		int count=0;
		HashSet<Character> charcount=new HashSet<Character>();
		for (int i = 0; i < inputString.length(); i++) {
			char ciputchar=inputString.charAt(i);
		while(!charcount.contains(ciputchar)){
			count++;
			charcount.add(ciputchar);
			
			break;
		}
		}
		
		if(count==27){
			System.out.println("pangram");
		}else{
			System.out.println("No pangram");
		}

	}

}
