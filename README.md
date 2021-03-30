
import java.util.*;
public class Day1 
{
	public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int k=s.nextInt();
		int f=0;
		Arrays.sort(a);
		int p1=0;
		int p2=a.length-1;
		while(p1<p2) {
			if ((a[p1]+a[p2])==k) 
			{
				System.out.print("TRUE");
				 f=1;
				break;
			}
			else if((a[p1]+a[p2])<k)
				p1+=1;
			else
				p2-=1;
		}
		if (f==0)
		System.out.print("false");
	}

}
