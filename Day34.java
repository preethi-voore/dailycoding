//Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.
import java.util.*;
public class Day34 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n-1;i++) {
			if(a[i+1]>=a[i]) {
				continue;
			}
			else {
				count++;
			}
			
		}
		if(count<=1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}

}
