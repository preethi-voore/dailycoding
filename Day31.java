import java.util.HashMap;
class Node1{
		int key;
		int value;
		Node1 prev;
		Node1 next;
		Node1(int key,int value){
			this.key=key;
			this.value=value;
			
		}
	}
public class Day31{
	int capacity=3;
	
	Node1 head,tail=null;
	HashMap<Integer,Node1> hm=new HashMap<Integer,Node1>();
	
	public int get_data(int key) {
		if(hm.containsKey(key)) {
			Node1 d1=hm.get(key);
			RemoveNode(d1);
			AddAtFirst(d1);
			return d1.value;
			

		}
		else {
			return -1;
		}
	}
	public void RemoveNode(Node1 d1) {
		Node1 a=d1.prev;
		Node1 b=d1.next;
		if (a!=null) {
			a.next=b;
			
		}
		else {
			head=b;
		}
		if (b!=null) {
			b.prev=a;
			
		}
		else {
          tail=a;
		}
		
		
	}
    public void AddAtFirst(Node1 d1) {
    	d1.next=head;
    	d1.prev=null;
    	if (head!=null) {
    		head.prev=d1;
    		head=d1;
    	}
    	if(tail==null) {
    		tail=d1;
    	}
    
    	
		
	}
	public void put_data(int key,int value) {
		if (hm.containsKey(key)) {
			Node1 d1=hm.get(key);
			d1.value=value;
			RemoveNode(d1);
			AddAtFirst(d1);
		}
		else {
			if(hm.size()>=capacity) {
				hm.remove(tail.key);
				RemoveNode(tail);
			}
			Node1 d1=new Node1(key,value);
			hm.put(key,d1);
			AddAtFirst(d1);
		}
	}
	public static void main(String args[]) {
		Day31 l=new Day31();
		l.put_data(3, 5);
		l.put_data(2, 4);
		System.out.println(l.get_data(7));
		l.put_data(6, 3);
		System.out.println(l.get_data(2));
		l.put_data(3, 8);
		System.out.println(l.get_data(3));
		
	}
	
}