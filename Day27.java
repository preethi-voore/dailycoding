//There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. You can only move right or down.
public class Day27 {
	public static void main(String args[]) {
		int[][] mat=new int[5][5];
		
		for(int i=1;i<5;i++) {
			mat[0][i]=1;
			mat[i][0]=1;
		}
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				mat[i][j]=mat[i-1][j]+mat[i][j-1];
				
			}
			}
		//for(int i=0;i<5;i++) {
			//for(int j=0;j<5;j++)
				//System.out.print(mat[i][j]);
			//System.out.println();
		//}
			
			System.out.println(mat[4][4]);
	}

}
