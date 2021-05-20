//Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
import java.util.*;
public class Day30 {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int p=n;
		int q=m;
		boolean rc=false;// true -colm,false=row
		boolean lr=false;//true -right, false=left
		int max=Math.max(n, m);
		int[][] a =new int[n][m];
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		int[] b=new int[100];
		int x=0;
		b[x++]=q;
		while((p!=1)&&(q!=1)) {
			p-=1;
			q-=1;
			b[x++]=p;
			b[x++]=q;
			
		}
		if((q==1)&&(p!=1)) {
			b[x++]=p-1;
			
		}
		p=0;
		q=0;
		//System.out.println(x);
		for(int i=0;i<x;i++)
		//	System.out.println(b[i]);
		//System.out.println(a[p][q]);
		p=0;
		q=-1;
		//System.out.println(a[0][0]);
		for(int i=0;i<x;i++) {
			rc=!rc;
			if(i%2==0) {
				lr=!lr;
			}
			//System.out.println(a[p][q]);
			for(int j=1;j<=b[i];j++) {
				
				
				if((rc==true )&&(lr== true )) {
					q+=1;
				}
				if((rc==true)&&(lr==false)) {
					q-=1;
					
				}
				
				if((rc==false)&&(lr==true)) {
					p+=1;
					
				}
                if((rc==false)&&(lr==false)) {
					p-=1;
				}
                System.out.println(a[p][q]);
                
				
			
			}
			
		}
		
		
	}}


