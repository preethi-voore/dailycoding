import java.util.Scanner;

//Given three 32-bit integers x, y, and b, return x if b is 1 and y if b is 0, using only mathematical or bit operations. You can assume b can only be 1 or 0.
public class Day38 {
	public static int main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int b=sc.nextInt();
		if((b&1)==1) {
			return x;
		}
		else {
			return y;
		}
	}

}
