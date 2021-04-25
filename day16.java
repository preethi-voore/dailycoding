//subsets
import java.util.*;
public class day16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<(1<<n);i++) {
			System.out.print('{');
			for (int j=0;j<n;j++) {
				  if ((i & (1 << j)) > 0)
	                    System.out.print(a[j] + " ");
			}
			System.out.print('}');
			
		}
		
	}

}
