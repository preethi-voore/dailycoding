//aaaabbb as a4b3 
import java.util.*;
public class day10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char initial=s.charAt(0);
		int count=0;
		String str=new String();
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)==initial) {
				count++;
			}
			
			else {
				str=str+initial+count;
				initial=s.charAt(i);
				i--;
				count=0;
			}
			
		}
	str=str+initial+count;
		System.out.println(str);
		
	}
	

}
