package HackerrankBeginner;

import java.util.Scanner;

public class AveryBigSum {
     public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long sum=0;
        for(Long i:arr){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}
