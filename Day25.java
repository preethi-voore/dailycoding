//Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.


class Node2 {
		int data;
		Node2 next;
		Node2 prev;
		Node2(int data){
			this.data=data;
		}
	}

class DoublyLinkedList {
	Node2 head,tail=null;
	public void add(int data) {
		Node2 n1=new Node2(data);
		if((head==null)||(tail==null)) {
			head=tail=n1;
			head.next=null;
			head.prev=null;
			}
		else {
			tail.next=n1;
			n1.prev=tail;
			tail=n1;
			tail.next=null;
			
		}
		
		
		
		
		
		
	}
	public void rotate() {
	//	Node n1=new Node(0); //dummy node
		while(head.data<tail.data) {
			tail.next=head;
			head.prev=tail;
			tail=tail.prev;
			tail.next=null;
			head.prev.prev=null;
			head=head.prev;
			
		}
	}
	public void disp() {
		Node2 n1;
		n1=head;
		while(n1!=null) {
			System.out.println(n1.data);
		n1=n1.next;}
	}
	
}
public class Day25 {
	public static void main(String args[]) {
		int[] a={13,18,25,2,8,10,12};
		int k=8; //key
		int len=a.length;
		DoublyLinkedList d1= new DoublyLinkedList();
	    for(int i=0;i<len;i++) {
	    	d1.add(a[i]);
	    }
	   
	    d1.rotate();
	  d1.disp();
	}

}

