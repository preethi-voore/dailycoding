//Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word. If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).
import java.util.*;
class day13{
    static int MinIns(char str[], int l,
                                             int h)
    {
        if (l > h) return Integer.MAX_VALUE;
        if (l == h) return 0;
        if (l == h - 1) return (str[l] == str[h])? 0 : 1;
        return (str[l] == str[h])?
            MinIns(str, l + 1, h - 1):
            (Integer.min(MinIns(str, l, h - 1),
           MinIns(str, l + 1, h)) + 1);
    }
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        System.out.println(MinIns(str.toCharArray(),
                                          0, str.length()-1));
    }
}