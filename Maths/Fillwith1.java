package Maths;

import java.util.Scanner;

public class Fillwith1 {

    public static int minMoves(int [] arr,int n){
        int iterations=0;

        while(true){
            boolean changed=false;
            int [] newarr=arr.clone();
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    if((i>0 && arr[i-1]==1) || (i<n-1 && arr[i+1]==1)){
                        newarr[i]=1;
                        changed=true;
                    }
                }
            }
            if(!changed){
                break;
            }
            iterations++;
            arr=newarr;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                return -1;
            }
        }
        return iterations;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
       }   
       System.out.println(minMoves(arr, n));
       sc.close();
    }
}