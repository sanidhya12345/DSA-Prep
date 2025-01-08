import java.util.*;
public class MaxThroughPut{
    public static long solve(long n,long [] arr){
        Arrays.sort(arr);
        long maxgroups=n/3;
        int secondlast=(int)n-2;
        long ans=0;
        while(maxgroups-->0){
            ans+=arr[secondlast];
            secondlast-=2;
        }
        return ans;
    }
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       long [] ar=new long[(int)n];
       for(int i=0;i<n;i++) ar[i]=sc.nextLong();
       System.out.println(solve(n,ar));
    }
}
