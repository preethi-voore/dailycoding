//Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one
import java.util.*;
public class Day20 {
	public static void main(String args[]) {
		Day20 c=new Day20();
		Scanner sc=new Scanner(System.in);
		 String input=sc.nextLine();
		int length=input.length();
		int max_palindrome_size=0;
		if (length>0) {
			
		
			max_palindrome_size=1;
		}
		//for even palindrome
		for (int i=0;i<length-1;i++) {
			
			
			max_palindrome_size=Math.max(max_palindrome_size, c.compute(input,i,i+1));
			
			
		}
		//for odd palindrome
		for (int i=1;i<length;i++) {
			
			
			max_palindrome_size=Math.max(max_palindrome_size, c.compute(input,i-1,i+1));
			
			
		}

		
		System.out.println(max_palindrome_size);
		
	}
	public int compute(String s,int a ,int b) {
		while((a>0)&&(b<s.length())&&(s.charAt(a)==s.charAt(b))) {
			a--;
			b++;
		}
		
		return b-a-1;
	}

}
