
public class BSTfindgreatest {
		
		public Node(int key){
			int Key=key;
			Node leftchild;
			Node rightchild;
		}
		
		public Boolean hasChildren(){
			if(leftchild==null && rightchild == null){
				return false;
			}else{
				return true;
			}
		}
		
		
		
	
	

	static void createMap(Node root, int x){
		(root.hasChildren()==false && root.Key>=x){
			return 0;
		}elseif(root.hasChildren()==false && root.Key<x){
			return root;
		}

		(root.leftchild.Key>=x){
			root=root.leftchild;
			createMap(root,x);
		}else{
			root=root.leftchild;
			if(root.rightchild!=null){
				root=root.rightchild;
						createMap(root, x);
			}         
		}

	}
	public static void main(String[] args) {
		Node example=new Node(9);
		
	}

}



