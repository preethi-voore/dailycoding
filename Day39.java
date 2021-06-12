import java.util.Scanner;

//Implement division of two positive integers without using the division, multiplication, or modulus operators. Return the quotient as an integer, ignoring the remainder.
public class Day39 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int quo=0;
		while(a>=b) {
			a=a-b;
			quo++;
		}
		System.out.println(quo);
	}

}
