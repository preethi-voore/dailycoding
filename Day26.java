//Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.


class Day26{
    public boolean checkfn(char[][] a,int row,String s) {
    	char[] p=a[row];
    	String str = String.valueOf(p);
    	
    	if(str.equals(s)) {
    		
    		return true;
    	}
    	
    	return false;
    	
    }
    public boolean check(char[][] a,int c,String s,int row) {
    	char[] p=new char[row];
    	for(int i=0;i<row;i++ ) {
    		p[i]=a[i][c];
    		
    	}
    	String str = String.valueOf(p);
    	if(str.equals(s))
    		return true;
    	return false;
    	

    	
    	
    }
	public static void main(String args[]) {
		Day26 xyz=new Day26();
		char[][] a= {{'F','A','C','I'},{'O','B','Q','P'},{'A','N','O','P'},{'M','A','S','S'}};
		String s="FOAM";
		int rows=a.length;
		int cols=a[0].length;
		int x=Math.max(rows, cols);
		boolean f=true;
		for(int i=0;i<x;i++) {
		
			if(i<rows) {
				
				if(a[i][0]==s.charAt(0)) {
					if(xyz.checkfn(a,i,s)) {
						System.out.println("true in row");
						f=false;
						break;
					}
					
				}
				
			}
           if(i<cols) {
        	   if(a[0][i]==s.charAt(0)) {
        		   if(xyz.check(a,i,s,rows)) {
        			   System.out.println("true in col");
        			   f=false;
						break;
        			   
        		   }
        	   }
        	   
				
			}
		}
		if(f)
		System.out.println("false");
		
		
	}
	
}