public class BinarySearchTree {
	public static  NodeTest root;
	public BinarySearchTree(){
		this.root = null;
	}
	
	public boolean find(int id){
		NodeTest current = root;
		while(current!=null){
			if(current.data==id){
				return true;
			}else if(current.data>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	public boolean delete(int id){
		NodeTest parent = root;
		NodeTest current = root;
		System.out.println("\n rott"+root.data);
		boolean isLeftChild = false;
		while(current.data!=id){
			parent = current;
			if(current.data>id){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		//if i am here that means we have found the NodeTest
		//Case 1: if NodeTest to be deleted has no children
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		//Case 2 : if NodeTest to be deleted has only one child
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			//now we have found the minimum element in the right sub tree
			NodeTest successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
	
	public NodeTest getSuccessor(NodeTest deleleNodeTest){
		NodeTest successsor =null;
		NodeTest successsorParent =null;
		NodeTest current = deleleNodeTest.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNodeTest.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNodeTest.right;
		}
		return successsor;
	}
	public void insert(int id){
		NodeTest newNodeTest = new NodeTest(id);
		if(root==null){
			root = newNodeTest;
			return;
		}
		NodeTest current = root;
		NodeTest parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNodeTest;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNodeTest;
					return;
				}
			}
		}
	}
	public void display(NodeTest root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public static void main(String arg[]){
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		System.out.println("Check whether NodeTest with value 4 exists : " + b.find(4));
		System.out.println("Delete NodeTest with no children (2) : " + b.delete(2));		
		b.display(root);
		System.out.println("\n Delete NodeTest with one child (4) : " + b.delete(4));		
		b.display(root);
		System.out.println("\n Delete NodeTest with Two children (10) : " + b.delete(10));		
		b.display(root);
	}
}

class NodeTest{
	int data;
	NodeTest left;
	NodeTest right;	
	public NodeTest(int data){
		this.data = data;
		left = null;
		right = null;
	}
}