package PrefixSum;

import java.util.*;
public class GoogleSDE3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }

        int [] prefix=new int[n+1];
        int [] suffix=new int[n+1];
        prefix[1]=0;

        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=1;j<=n;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
            prefix[i]=count;
        }

        suffix[n]=0;
        for(int j=n-1;j>=1;j--){
            int count=0;
            for(int k=j+1;k<=n;k++){
                if(a[j]<a[k]){
                    count++;
                }
            }
            suffix[j]=count;
        }

        int finalcount=0;
        for(int i=1;i<=n;i++){
            finalcount+=(prefix[i]*suffix[i]);
        }
        System.out.println(finalcount);
        sc.close();
    }
}
