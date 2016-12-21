import java.util.Scanner;

public class AppleOrange {

	public AppleOrange() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        int s = 7;
	        int t = 11;
	        int a = 5;
	        int b = 15;
	        int m = 3;
	        int n = 2;
	        int appleCount=0,orangeCount=0;
	        int[] apple = new int[]{-2,1,2};
	        /*for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	        }*/
	        int[] orange = new int[]{-6,5};
	       /* for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	        }*/
	         for(int apple_i=0; apple_i < m; apple_i++){
	            if(apple[apple_i]>0 &&((a+apple[apple_i])>=s && (a+apple[apple_i]) <=t))
	              appleCount++; 
	        }
	        for(int orange_i=0; orange_i < n; orange_i++){
	        	System.out.println(b+orange[orange_i]);
	            if(orange[orange_i]<0 &&((b+orange[orange_i]) <=t) && (b+orange[orange_i])>=s)
	              orangeCount++; 
	        }
	        System.out.println(appleCount);
	        System.out.println(orangeCount);

	}

}
