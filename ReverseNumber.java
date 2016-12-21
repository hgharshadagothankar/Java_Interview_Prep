
public class ReverseNumber {

	public ReverseNumber() {
		// TODO Auto-generated constructor stub
	}
	public static void reverse(int num){
		int rev=0;
		
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("num"+num);
		System.out.println("rev"+rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int revnum=23456;
      
      
      reverse(revnum);

	}

}
