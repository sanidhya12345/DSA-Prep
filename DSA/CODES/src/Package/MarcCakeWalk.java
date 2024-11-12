package Package;


import java.util.*;
public class MarcCakeWalk {

	
	public static void solve(Integer [] arr,int n) {
		int i=0;
		long ans=0;
		while(i<n) {
			long cal=((long)Math.pow(2, i))*arr[i];
			System.out.println(cal);
			ans+=cal;
			i++;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer [] arr=new Integer[n];
		int i=0;
		while(i<n) {
			arr[i]=sc.nextInt();
			++i;
		}
		//decreasing sort the array
		Arrays.sort(arr,(a,b)->b-a);
		System.out.println(Arrays.toString(arr));
		solve(arr,n);
		sc.close();
	}

}
