package TwoPointers.SlidingWindow;
import java.util.Scanner;

public class MaximumNonOverlappingSum {

	public static int [] windowSuffix(int [] arr,int n,int k) {
		int i=n-1;
		int j=n-1;
		int index=n-1;
		int sum=0;
		int [] suffix=new int[n];
		while(j>=k-1) {
			sum+=arr[j];
			if(Math.abs(j-i)+1<k) {
				j--;
			}
			else if(Math.abs(j-i)+1==k) {
				suffix[index]=sum;
				sum-=arr[i];
				i--;
				j--;
				index--;
			}
		}
		return suffix;
	}
	public static void solve(int [] arr,int n,int k) {
		int s1=0;
		for(int i=0;i<k;i++) {
			s1+=arr[i];
		}
		int [] suffix=windowSuffix(arr, n, k);
		int max_sum=s1+suffix[k];
		
		for(int i=k;i<=n-k;i++) {
			int s2=s1+arr[i]-arr[i-k];
			s1=s2;
			max_sum=Math.max(max_sum,s1+arr[i]);
		}
		System.out.println(max_sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		solve(arr, n, k);
		sc.close();
	}

}
