import java.util.Scanner;
public class Day22 {
	
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a =new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int max1 = Integer.MIN_VALUE, max2 = 0;

    for (int i = 0; i < n; i++)
    {
        max2 += a[i];
        if (max1 < max2)
            max1 = max2;
        if (max2 < 0)
            max2 = 0;
    }
  System.out.println(max1);
	
	
}

}
