//Given an array of integers where every integer occurs twice  except for one integer, which only occurs once, find and return the non-duplicated integer.
import java.util.*;
public class day17 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int p=a[0];
		for (int i=1;i<n;i++)
			p=p^a[i];
		System.out.println(p);
		
		
	}

}
