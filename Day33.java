import java.util.*;
 
class Day33
{
static int maxProduct(int []arr, int n)
{
    if (n < 3)
        return -1;
    int[] leftMin = new int[n];
    int[] rightMin = new int[n];
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];
    Arrays.fill(leftMin, -1);
    Arrays.fill(leftMax, -1);
    Arrays.fill(rightMax, -1);
    Arrays.fill(rightMin, -1);
    int maxpro = Integer.MIN_VALUE;
    int maxsum = arr[0];
     int min_sum = arr[0];
 
    for (int i = 1; i < n; i++)
    {
        leftMax[i] = maxsum;
        if (arr[i] > maxsum)
            maxsum = arr[i];
 
        leftMin[i] = min_sum;
        if (arr[i] < min_sum)
            min_sum = arr[i];
    }
 
    maxsum = arr[n - 1];
 
    min_sum = arr[n - 1];
 
    for (int j = n - 2; j >= 0; j--)
    {
        rightMax[j] = maxsum;
        if (arr[j] > maxsum)
            maxsum = arr[j];
 
        rightMin[j] = min_sum;
        if (arr[j] < min_sum)
            min_sum = arr[j];
    }
    for (int i = 1; i < n - 1; i++)
    {
        int max1 = Math.max(arr[i] * leftMax[i] * rightMax[i],
                    arr[i] * leftMin[i] * rightMin[i]);
 
        int max2 = Math.max(arr[i] * leftMax[i] * rightMin[i],
                    arr[i] * leftMin[i] * rightMax[i]);
 
        maxpro = Math.max(maxpro, Math.max(max1, max2));
    }
 
    return maxpro;
}

public static void main (String[] args)
{
    int []arr = { 1, 4, 3, -6, -7, 0 };
    int n = arr.length;
 
    int max = maxProduct(arr, n);
 
    System.out.println(max);
}
}