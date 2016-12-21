
public class HackerRank {

	public HackerRank() {
		// TODO Auto-generated constructor stub
	}
	 static int sum(int[] numbers) {
		 int sum=0;
		 
		 for(int i=0;i<numbers.length;i++){
			 sum=sum+numbers[i];
			 
		 }
		return sum;


	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,4,5,6,7};
		int result=sum(a);
		System.out.println("result"+result);

	}

}
