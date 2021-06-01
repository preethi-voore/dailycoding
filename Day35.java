//You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that can be removed to ensure that each row is ordered from top to bottom lexicographically. That is, the letter at each column is lexicographically later as you go down each row. It does not matter whether each row itself is ordered lexicographically.
import java.util.*;
public class Day35 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//rows
		int m=sc.nextInt();//cols
		int count=0;
		char[][] a=new char[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.next().charAt(0);
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n-1;j++) {
				if((Character.compare(a[j][i], a[j+1][i]))>0) {
					count++;
					break;
				}
					else {
						continue;
						
					}
					
					
					
				
			}
		}
	System.out.println(count);
		
		
		
		
		
		
	}

}
