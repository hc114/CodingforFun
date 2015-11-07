
public class BSTfindgreatest {
	public class Node{
		int key;
		Node leftchild;
		Node rightchild;
	}

	static void createMap(Node root, int x){
		(root.hasChildren()==null && root>=x){
			return 0;
		}elseif(root.hasChildren()==null && root<x){
			return root;
		}

		(root.leftchild>=x){
			root=root.leftchild;
			createMap(root,x);
		}else{
			root=root.leftchild();
			if(root.rightchild!=null){
				root=root.rightchild()
						createMap(root,int x);
			}         
		}

	}
	public static void main(String[] args) {
		String pramp = "Practice Makes Perfect";
		System.out.println(pramp);
	}

}



