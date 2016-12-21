
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String temp={"s","s","s"};
		System.out.println(Math.ceil(-4.7));
		int n=6;
		//System.out.println("hii");
		// TODO Auto-generated method stub
		for (int i = 0; i <n; i++) {
			for (int j = (n-1); j > i; j--) {
				
               /* if(i!=5)*/
				System.out.print("*");
			}
			
			for(int k=0;k<=i;k++)
			{
			System.out.print("#");
			}
			System.out.println(" ");
		}
	}

}
