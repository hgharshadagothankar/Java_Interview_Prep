/**
 * 
 */

/**
 * @author hghar
 *
 */
public class BinarySearchTreeHarshada {
	public static Node root;
	public BinarySearchTreeHarshada() {
		// TODO Auto-generated constructor stub
		this.root=null;
	}
    public void insert(int id){
    	Node newNode=new Node(id);
    	if(root==null){
    	 root=newNode;	
    	 return;
    	}
    	Node currentNode=root;
    	Node parentNode=null;
    	while (true){
    		parentNode=currentNode;
    		if(id<currentNode.data){
    			currentNode=currentNode.left;
    			    if(currentNode==null){
    			    	parentNode.left=newNode;
    			    	return;
    			    	}
    		}else{
    			currentNode=currentNode.right;
    				if(currentNode==null){
    					parentNode.right=newNode;
    					return;
    					}
    		}
    	}
    	
    	
    }
    @SuppressWarnings("unused")
	public boolean delete(int id){
    	Node currentNode=root;
    	Node parentNode=null;
    	boolean isleftChild=false;
    	//to iterate till the node to be deleted
    	while(currentNode!=null){
    		parentNode=currentNode;
    		if(id<currentNode.data){
    			isleftChild=true;
    			currentNode=currentNode.left;
    		}else{
    			isleftChild=false;
    			currentNode=currentNode.right;
    		}
    	}
    	if(currentNode==null){
    		return false;
    	}
    	//case 1
    	if(currentNode.left==null && currentNode.right==null){
    		if(currentNode == root){
    			root=null;
    		}
    		if(isleftChild){
    			parentNode.left=null;
    		}else{
    			parentNode.right=null;
    		   }
    //case 2		
    	}else if(currentNode.right ==null){
    		if(currentNode==root){
    			root=currentNode.left;
    		}else if(isleftChild){
    			parentNode.left=currentNode.left;
    		}else{
    			parentNode.right=currentNode.left;
    		}	
    	}else if(currentNode.left ==null){
    		if(currentNode==root){
    			root=currentNode.right;
    		}else if(isleftChild){
    			parentNode.left=currentNode.right;
    		}else{
    			parentNode.right=currentNode.right;
    		}
    //case 3
    	}else if(currentNode.left!=null && currentNode.right!=null){
    		//get succesor
    		Node sucessor=getSuccesor(currentNode);
    		//currentNode=sucessor;
    		if(currentNode==root){
    			root=sucessor;
    		}else if(isleftChild){
    			parentNode.left=sucessor;
    			
    		}else{
    			parentNode.right=currentNode.right;
    		}
    		sucessor.left=currentNode.left;
    	}
    	
    	return true;
    }
    public Node getSuccesor(Node deleteNode){
    	Node sucessor=null;
    	Node sucessorparent=null;
    	Node currentNode=deleteNode.right;
    	while(currentNode!=null){
    		sucessorparent=sucessor;
    		sucessor=currentNode;
    		currentNode=currentNode.left;
    	}
    	if(sucessor!=deleteNode.right){
    		sucessorparent=sucessor.left;
    		sucessor.right=deleteNode.right;
    	}
    	return sucessor;
    }

    public void display(Node root){
    	
    	if(root!=null){
    		
		display(root.left);
		System.out.print(" "+root.data);
		display(root.right);
	//	display(root);
    	}
	}
    public boolean find(int id){
    	Node currentNode=root;
    	
    	while(currentNode!=null){
    		if(currentNode.data==id){
    			return true;
    		}
    		else if(currentNode.data>id){
    			currentNode=currentNode.left;
    			
    		}else{
    			currentNode=currentNode.right;
    		}
    	}
    	
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeHarshada b = new BinarySearchTreeHarshada();
		b.insert(23);
		b.insert(22);
		b.insert(21);
		System.out.println("Display inserted list");
	    b.display(b.root);

	}

}
class Node{
	 Node left;
	 Node right;
	int data;
	public Node(int data) {
		// TODO Auto-generated constructor stub
	      this.data=data;
	      left=null;
	      right=null;
	}
}