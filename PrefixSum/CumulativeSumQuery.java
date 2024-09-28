package PrefixSum;
import java.util.*;
public class CumulativeSumQuery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int q=sc.nextInt();
        while(q--!=0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(l==0){
                System.out.println(prefix[r]-prefix[l]);
            }
            System.out.println(prefix[r]-prefix[l-1]);
        }  
        sc.close();
    }
}
