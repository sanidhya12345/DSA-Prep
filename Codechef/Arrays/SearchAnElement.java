package Codechef.Arrays;

import java.util.Scanner;

public class SearchAnElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(Integer i:arr){
            if(i==target){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
