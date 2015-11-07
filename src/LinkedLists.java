
public class LinkedLists{
	private Node head;
	
	public class Node{
		Node next;
		private int Nodevalue;
		public Node(int value){
			Nodevalue=value;
			next=null;
		}
		
		public int getData(){
			return Nodevalue;
		}
		
		public void setData(int newData){
			Nodevalue=newData;
		}
		public Node getNext(){
			return next;
		}
		
		public void setNext(Node n){
			next=n;
		}

	}

	void addNode(int value, int index){
		Node temp = new Node(value);
		Node current = head;
		int counter =0;

		while(current.getNext()!=null){
			//<----> you are still in the linked list
			counter++;
			if(index==counter){
				//temporary node
				current.setNext(temp);
				current=current.getNext();
				return;
			}
			else{
				current = current.getNext();
			}
		}
		//you have reached the end of the linked list
		current.setNext(temp);
		return;
	}


	public static void main(String[] args){
		LinkedLists run = new LinkedLists();
		run.addNode(1,1);
	}
} 