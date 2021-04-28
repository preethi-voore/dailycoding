//stack operations
public class Day19 {
	int[] a=new int[10];
	int[] temp=new int[10];//for max value
	int i=0;
	public  void push(int x) {
		if (i==0) {
			a[i]=x;
			temp[i]=x;
			i++;}
		else if (i<10) {
			a[i]=x;
		temp[i]=maxi(x,temp[i-1]);
		i++;}
		else
			System.out.println("stack full");
		
	}
	public int maxi(int a,int b) {
		if (a>b)
			return a;
		return b;
		
	}
	public void pop() {
		if (i>0) {
		System.out.println(a[--i]);
		
		}
		else
			System.out.println("stack empty");
	}
	public void max() {
		System.out.println(temp[i-1]);
	}
	
	public static void  main(String args[]) {
		Day19 a=new Day19();
		a.push(12);
		
		a.push(13);
		a.pop();
		a.pop();
		a.push(15);
		a.push(7);
		a.max();
		
		
	}
	


}
