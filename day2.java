import java.util.*;

public class day2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	int a[]=new int[n];
	for (int i=0;i<n;i++) {
		a[i]=s.nextInt();
		
	}
	int b[]=new int[n];
	b[0]=1;
	int c[]=new int[n];
	c[n-1]=1;
	int out[]=new int[n];

	
		for (int i=1;i<a.length;i++) {
		b[i]=b[i-1]*a[i-1];
	}
	for (int i=(a.length-2);i>=0;i--) {
		c[i]=c[i+1]*a[i+1];
	}
	for (int i=0;i<a.length;i++)
		out[i]=b[i]*c[i];
	for (int i=0;i<a.length;i++) {
		System.out.print(out[i]+" ");
	}
	
	}
	

}
