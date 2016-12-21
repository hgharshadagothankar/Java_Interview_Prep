
public class PalindromeCheck {

	public PalindromeCheck() {
		// TODO Auto-generated constructor stub
	}

	public static void checkPalindrome(String input){
		
		char inputchar[]=input.toCharArray();
		boolean flag=false;
		int inputlenght=input.length();
		
		
		/* * With for loop
		 * */for (int i = 0; i < input.length()/2; i++) {
			for (int j = (input.length()-1)/2; j > 0; j--) {
				
				if(inputchar[i] == inputchar[j] && i!=j){
				//	System.out.println("true i--"+inputchar[i]+"----j----"+inputchar[i]);
					flag=true;
					
				}
				else{
					//System.out.println(" false i--"+inputchar[i]+"----j----"+inputchar[i]);
					flag=false;
					///break;
				}
			}
			
		}
		if(flag){
			System.out.println("String is Palindrome");
		}else{
			System.out.println("String is not Palindrome");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malayalam";
		checkPalindrome(str);

	}

}
