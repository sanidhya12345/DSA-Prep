package HackerrankBeginner;

import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        long maxsum=0;
        long minsum=0;

        for(int i=0;i<n-1;i++){
            minsum+=arr[i];
        }

        for(int i=1;i<n;i++){
            maxsum+=arr[i];
        }

        System.out.println(minsum+" "+maxsum);
        sc.close();

    }
}
