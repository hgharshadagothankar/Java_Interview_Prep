
public class Mystery {

	public Mystery() {
		// TODO Auto-generated constructor stub
	}
	public static String scramble(String str)
    {
         if (str.length() >= 2)
         {
              int n = str.length() / 2;
              str = scramble(str.substring(n)) + str.substring(0, n);
         }
         return str;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(mystery("DELIVER"));
		
		/*String s = "ONION";
	    System.out.println(s.substring(1, 5).substring(1, 4).substring(0, 3));*/
		
		/*int x = 5, y = 2;
	    System.out.println(x/y - (double)(x/y));
*/
		
		int i, n = 0;
	    while (n < 90)
	    {
	         for (i = 0; i < 10; i++)
	         {
	              n += 3;
	              if (n > 50)
	                   break;
	         }
	         n++;
	    }
System.out.println(n);

	}

}
