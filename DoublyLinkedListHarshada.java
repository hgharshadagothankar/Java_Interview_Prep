
public class DoublyLinkedListHarshada {

	public DoublyLinkedListHarshada() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedListMain dd=new DoublyLinkedListMain();
		dd.addFirst("harshada");
		dd.addFirst("12");
		dd.addFirst("16");
		dd.displayList();
		dd.removeFirst();
		dd.displayList();
		dd.addFirst("domple");
		dd.addFirst("duddy");
		dd.displayList();
		dd.removeLast();
		System.out.println("hiiiiiiii");
		dd.displayList();
		dd.addFirst("simple");
		dd.addFirst("duddy");
		dd.displayList();
		

	}

}
class DoublyLinkedListMain<T>{
	private Node first;
	private Node last;
	
	public void addFirst(T data){
		Node newNode=new Node(data);
		if(isEmpty()){
			newNode.head=null;
			newNode.tail=null;
			first=newNode;
			last=newNode;
		}else{
			first.tail=newNode;
			newNode.head=first;
			newNode.tail=null;
			first=newNode;
			
		}
		//newNode.displayData();
	}
	
	public void removeFirst(){
		
		if(!isEmpty()){
			Node tempNode=first;
		if(first.head==null){
			first=null;
			last=null;
		}else{
			first=first.head;
			first.tail=null;
		}
		
		System.out.println(tempNode+" element removed");
	//	tempNode.displayData();
		}		
	}
	public void removeLast(){
		Node current=last;
		if(!isEmpty()){
			if(first.head==null){
			first=null;
			last=null;
		}else{
			last=last.tail;
			last.head=null;
		}
	}
	}
	public void displayList(){
		Node current=first;
		while(current!=null){
			current.displayNode();
			current=current.head;
			//System.out.print(current.data+" ");
		}
		System.out.println();
		
	}
	public boolean isEmpty(){
	return (first==null);
	}
	
	private static class Node<T>{
		public Node head;
		public Node tail;
		public T data;
		public Node(T data) {
			// TODO Auto-generated constructor stub
			this.data=data;
		}
		public void displayNode(){
			System.out.print(data+" ");
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return data.toString();
		}
		
	}

}