package HackerrankBeginner;

import java.util.Scanner;

public class BirthdayCandles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }

        int count=0;
        for(Integer i:arr){
            if(max==i) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
