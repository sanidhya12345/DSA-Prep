package Hashing;
import java.util.*;
public class CountNumberOfPartitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] ar=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        int totalsum=0;
        for(int i=0;i<n;i++) totalsum+=ar[i];
        int partitions=0;
        int lhs=0;
        for(int i=0;i<n;i++){
            lhs+=ar[i];
            if(lhs==totalsum-lhs){
                partitions++;
            }
        }
        System.out.println(partitions);
        sc.close();

    }
}
