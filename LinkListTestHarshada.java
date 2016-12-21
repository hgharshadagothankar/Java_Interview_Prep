import sun.net.TelnetProtocolException;

public class LinkListTestHarshada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTest ll=new LinkedListTest();
		ll.add(10);

	}

}

class LinkedListTest{
	 private int counter;
	 private Node head;
	 public int getCounter(){
			return counter;
		}
		public int incrementCounter(){
			return counter++;
		}
		public int decrementCounter(){
			return counter--;
		}
	
	public void add(Object dataValue){
	
		if(head == null){
			head=new Node(dataValue);
		}
		
		Node currentNode=head;
		Node tempNode=new Node(dataValue);
		if(currentNode!=null){
		while(currentNode.getnext()!=null){
			currentNode=currentNode.getnext();
		}
		currentNode.setNextData(tempNode.getData());
		}
		incrementCounter();
	}
	public void add(Object dataValue,int index){
	
    Node currentNode=head;
    Node tempNode=new Node(dataValue);
    if(currentNode!=null){
    for(int i=0;i < index ;i++){
    	while(currentNode.getnext()!=null){
    		currentNode=currentNode.getnext();
    		
    	}
    	
       }
    }
    tempNode.setNextData(currentNode.getData());
	currentNode.setNextData(tempNode);
    incrementCounter();
	}
	public boolean remove(int index){
		
		if(index<1 ||index > getCounter()){
			return false;
		}
		Node currentNode=head;
		if(head!=null){
		for(int i=0;i<index ;i++){
			if( currentNode.getnext()==null){
				return false;
			}
			currentNode=currentNode.getnext();
		}
		currentNode.setNextData(currentNode.getnext().getnext());
		decrementCounter();
		return true;
		}
		
		return false;
		
	}
	public Object get(int index){
		if(index<1 || index >getCounter())
			return null;
		Node currentNode=null;
		if(head!=null){
			currentNode=head.getnext();
			for(int i=0;i<index;i++){
				if(currentNode.getnext()==null)
					return null;
			currentNode=currentNode.getnext();
			}//end for
					return currentNode.getData();
			} //end if
		
		return currentNode;
	}
	class Node{
		private Node next;
		private Object data;
      
       Node(Object dataValue){
			next=null;
			data=dataValue;
			
		}
		public Node(Object dataValue,Node nextValue) {
			// TODO Auto-generated constructor stub
			next=nextValue;
			data=dataValue;
		}
		
		public void setData(Object dataValue){
			data=dataValue;
		}
		
		public Object getData(){
			return data;
		}
		public void setNextData(Object data){
			next.data=data;
		}
		public Node getnext(){
			return next;
		}
	}
}