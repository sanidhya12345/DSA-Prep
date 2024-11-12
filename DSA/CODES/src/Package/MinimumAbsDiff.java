package Package;

import java.util.*;
public class MinimumAbsDiff {

	public static int minimumAbsoluteDifference(int []  arr,int n) {
	    // Write your code here
		int diff=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			diff=Math.min(diff,Math.abs(arr[i]-arr[i-1]));
		}
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] ar=new int[n];
		int i=0;
		while(i<n) {
			ar[i]=sc.nextInt();
			i++;
		}
		Arrays.sort(ar);
		System.out.println(minimumAbsoluteDifference(ar,n));
		sc.close();
	}

}
