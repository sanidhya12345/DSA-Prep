package Greedy;
import java.util.*;
public class MaxMinHappiness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //find the minimum happiness

        int min=0;
        for(int i=0;i<k;i++){
            min+=arr[i];
        }

        //find the maximum happiness

        int max=0;

        for(int i=n-1;i>k;i--){
            max+=arr[i];
        }
        System.out.println("Maximum Happiness "+max);
        System.out.println("Minimum Happiness "+min);
        sc.close();
    }
}
