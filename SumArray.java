import java.util.HashMap;
import java.util.Map;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,5,6,2,3,2,2,1};
		int k=5;
		Map<Integer,Integer> addMap=new HashMap<Integer,Integer>();
		
		for(int i=0;i<=a.length;i++){
			for(int j=1;j<=a.length;j++){
				if((a[i]+a[j])==k){
					addMap.put(a[i], a[i]+a[j]);
				}else{
					addMap.put(a[i], 1);
				}
			}
		}
		for(int i=0;i<=addMap.size();i++){
		 System.out.println("arr"+addMap.get(i));
		}
		

	}

}
