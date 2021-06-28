import java.util.Scanner;


//Determine whether a doubly linked list is a palindrome. 
public class Day40 {
public static void main(String args[]) {
	dll ll=new dll();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int x=sc.nextInt();
		ll.insert(x);
	}
     ll.checkpalindrome();
	
}
}







class dll{
	Nodedll head,tail=null;
	public void printt() {
		Nodedll dummy=head;
		while(dummy!=null) {
			System.out.println(dummy.data);
			dummy=dummy.next;
			
		}
	}
	public void checkpalindrome() {
		Nodedll h,t;
		h=head;
		t=tail;
		boolean flag=true;
		while (h!=t) {
			if (h.data==t.data) {
				h=h.next;
				t=t.prev;
			}
			else {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
	}
	public void insert(int data) {
		Nodedll n1=new Nodedll();
		Nodedll x;
		x=n1.Nodedllins(data);
		if(head==null) {
			x.prev=x.next=null;
			head=x;
			tail=x;
		}
		else {
			Nodedll dummy;
			x=n1.Nodedllins(data);
			tail.next=x;
			x.prev=tail;
			tail=x;
			tail.next=null;
			
		}
		
	}
}
class Nodedll{
	int data;
	Nodedll prev;
	Nodedll next;
	Nodedll(){
		super();
	}
	
	public Nodedll Nodedllins(int data){
		Nodedll t1=new Nodedll();
		t1.data=data;
		return t1;
		
	}
	}
