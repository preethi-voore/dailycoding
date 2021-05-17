//Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.

import java.util.*;
public class Day28 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();// computing a power b
		int[] dp=new int[b+1];
		dp[0]=1;
		dp[1]=a;
		for(int i=2;i<=b;i++) {
			if ((i&1)==1) {
				dp[i]=dp[(i-1)/2]*dp[(i-1)/2]*a;
			}
			else {
				dp[i]=dp[(i)/2]*dp[(i)/2];
				
			}
			
		}
		System.out.println(dp[b]);
		
	}

}
