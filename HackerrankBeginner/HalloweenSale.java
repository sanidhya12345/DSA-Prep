package HackerrankBeginner;

import java.util.*;
public class HalloweenSale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int d=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        int [] arr=new int[10001];
        for(int i=0;i<10001;i++){
            if(p>m){
                arr[i]=p;
                p-=d;
            }
            else{
                arr[i]=m;
            }
        }
        int count=0;
        int sum=0;
        for(int i=0;i<10001;i++){
            sum+=arr[i];
            if(sum<=s){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
