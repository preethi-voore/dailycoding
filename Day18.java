//subset of sum 'k'
import java.util.*;
class Day18{
    static boolean SubsetSum(int a[],
                               int n, int sum)
    {
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
        if (a[n - 1] > sum)
            return SubsetSum(a, n - 1, sum);
        
        return SubsetSum(a, n - 1, sum)
                || SubsetSum(a, n - 1, sum - a[n - 1]);
        }
 
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] a=new int[n];
    	for (int i=0;i<n;i++)
    		a[i]=sc.nextInt();
    	int sum=sc.nextInt();
        if (SubsetSum(a, n, sum) == true)
           System.out.println("sum found");
        else
          System.out.println("null");
    }
}