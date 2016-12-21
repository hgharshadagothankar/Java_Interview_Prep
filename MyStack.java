import java.util.*;
import java.lang.*;
import java.io.*;

class MyStack {
	private static   boolean isParenthesisMatch(String str) {
	    Stack<Character> stack = new Stack<Character>();

	    char c;
	  //  boolean flag=true;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);

	        if(c == '{')
	        	stack.push(c);

	        if(c == '('){
	            stack.push(c);
	        }

	        if(c == '}') {
	                if(stack.empty())
	                    return false;
	                else if(stack.peek() == '{')
	                    stack.pop();
	                else
	                    return false;
	        }
	        else if(c == ')')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '(')
	                    stack.pop();
	                else
	                    return false;
	        else if(c == ']')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '[')
	                    stack.pop();
	                else
	                    return false;
	        }
	        return stack.empty();
	}

	public static void main(String[] args) {        
	    String[] str = null;
	    //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    @SuppressWarnings("resource")
		Scanner bufferedReader=new Scanner(System.in);
        //System.out.println("Enter test cases");
        int testcases=0;
        try {
        	testcases=bufferedReader.nextInt();
        	str=new String[testcases];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for(int i=0;i<testcases;i++){
        	// System.out.println("Enter input---"+i+"testcases---"+testcases);
     		str[i]=bufferedReader.nextLine();
        }
	    for(int i=0;i<=(testcases-1);i++){
	    if(isParenthesisMatch(str[i])){
	    	System.out.println("balanced");
	    }else{
	    	System.out.println("not balanced");
	    }
	    }
	}
}