import java.util.HashSet;
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int []a = {2,45,7,3,5,1,8,9,2,3,56,-46};
		  insertsorting(a);
		}
		public static void insertsorting(int[] array) {
			
		    for(int i=1;i<array.length;i++){
		    	int key =array[i];
		    	int j=i-1;
		    	while((i>-1)&& array[i]>array[j]){
		    		array[i]=array[j];
		    		j++;
		    	}
		    	
		    }

	}

}
