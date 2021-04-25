//rain water collection
import java.util.*;
import java.lang.Math;
public class day9 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int water=0;
		int[] a=new int[n];
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int[] lmax=new int[n];
		int[] rmax=new int[n];
		lmax[0]=a[0];
		rmax[n-1]=a[n-1];
		for (int i=1;i<n;i++) {
			lmax[i]=max(a[i],lmax[i-1]);
			rmax[n-i-1]=max(a[n-i-1],rmax[n-i]);
			
		}
	/*	for (int i=0;i<n;i++)
			System.out.print(rmax[i]);
		System.out.println();	
		for (int i=0;i<n;i++)
			System.out.print(lmax[i]);
		System.out.println();	*/
		for (int i=0;i<n;i++) {
			int k=min(lmax[i],rmax[i]);
			water+=Math.abs(k-a[i]);
			
			
		}
		System.out.println(water);
		
		
			
			
		
	}
	public static int max(int x,int y) {
		if (x>y) {
		return x;}
		else {return y;}
	}
	public static int min(int x,int y) {
		if (x<y) {
		return x;}
		else {return y;}
	}
	}


