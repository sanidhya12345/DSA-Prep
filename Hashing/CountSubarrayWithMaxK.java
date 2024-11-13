import java.util.Scanner;

public class CountSubarrayWithMaxK {
	public static void solve(int [] arr,int n,int k) {
		int count=0;
		for(int i=0;i<n;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=i;j<n;j++) {
				max=Math.max(max,arr[j]);
				
				if(max>k) break;
				if(max==k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int [] arr=new int[n];
	    int i=0;
	    while(i<n) {
	    	arr[i]=sc.nextInt();
	    	++i;
	    }
	    solve(arr,n,k);
	    sc.close();
	}

}
