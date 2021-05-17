//Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.
import java.util.Arrays;
public class Day29 {
	
	public static void main(String args[]) {
		int[] a= {15, 5, 20, 10, 35};
		int total=0;
		for (int i=0;i<a.length;i++) {
			total+=a[i];
			
		}
			
		if((total&1)==1) 
		{
			System.out.println("cannot divide");
		}
		else {
			Arrays.sort(a);
			int k=total/2;
			
			if(findd(a,k)) {
				System.out.println("can be divided");
			}
			else {
				System.out.println("cannot divide");
			}
		}
	}
	public static boolean findd(int[] a,int sum) {
		int f=0;
		int s=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==sum) {
				return true;
			}
		}
		while(s>f) {
			    if ((a[s]+a[f])==sum)
				   return true;
				else if((a[s]+a[f])>sum)
					s--;
				else
					f++;
			
		}
		return false;
	}

}
