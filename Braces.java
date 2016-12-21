import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Braces {

	public Braces() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
       /* final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));*/
        String[] res;
        
        int _values_size = 0;
        System.out.println("Enter size:\n");
        _values_size = in.nextInt();
        String[] _values = new String[_values_size];
        String _values_item;
       
        for(int _values_i = 0; _values_i < _values_size; _values_i++) {
            try {
            	 System.out.println("Enter value "+_values_i);
                _values_item = in.nextLine();
            } catch (Exception e) {
                _values_item = null;
            }
            _values[_values_i] = _values_item;
        }
        
        res = braces(_values);
        for(int res_i=0; res_i < res.length; res_i++) {
            /*bw.write(String.valueOf(res[res_i]));
            bw.newLine();*/
        	System.out.println(res[res_i]);
        }
        
       // bw.close();
    }

	 static String[] braces(String[] _values) {
		// TODO Auto-generated method stub
		 String result[]=new String[_values.length];
		 Stack<Character> stack = new Stack<Character>();
		 for(int i = 0; i < _values.length; i++) {
			 System.out.println("values"+_values[i].length());
			 for (int j = 0; j < _values[i].length(); j++) {
				
			 char c = _values[i].charAt(j);
	            if(c == '[' || c == '(' || c == '{' ) {
	                stack.push(c);

	            }else if(c == ']') {
	                if(stack.isEmpty()) result[i]="NO";
	                if(stack.pop() != '[') result[i]="NO";

	            }else if(c == ')') {
	                if(stack.isEmpty()) result[i]="NO";
	                if(stack.pop() != '(') result[i]="NO";

	            }else if(c == '}') {
	                if(stack.isEmpty()) result[i]="NO";
	                if(stack.pop() != '{') result[i]="NO";
	            }
	            else{
	            	result[i]="YES";
	            }
			 }
	           

	        }
		return result;
	}

}
