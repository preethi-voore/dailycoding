//Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.

import java.util.*;
public class day12 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] a =new char[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.next().charAt(0);
		}
		int count=0;
		for (int i=0;i<n;i++) {
			if (a[i]=='R') {
				char x=a[i];
				a[i]=a[count];
				a[count]=x;
				count++;
			}	
		}
		int y=count;
		for (int i=y ;i<n;i++) {
			if (a[i]=='G') {
				char x=a[i];
				a[i]=a[count];
				a[count]=x;
				count++;
			}	
		}
	 y=count;
		for (int i=y ;i<n;i++) {
			if (a[i]=='B') {
				char x=a[i];
				a[i]=a[count];
				a[count]=x;
				count++;
			}	
		}
		for (int i=0;i<n;i++) {
			System.out.print(a[i]);
			
			
		}
			
			
		
		
		
	}
	
}
