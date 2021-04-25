import java.util.*;
public class day3 {
	//smallest possible integer missing
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> hm= new HashMap<>(); 
		for(int i=0;i<n;i++) {
			if (hm.containsKey(arr[i]) || arr[i]<=0) 
				continue;
			else
				hm.put(arr[i],1);
		}
		int j=1;
		int f=0;
		for(int i=0;i<hm.size();i++)	{
			if (hm.containsKey(j)){
				j++;
				continue;
				
			}
			else
				System.out.print(j);
			f=1;
			break;
	
			
			
		}
		if(f==0)
		System.out.print(j);
		
		
		
	}
}



