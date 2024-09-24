package HackerrankBeginner;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countZero=0;
        int countPlus=0;
        int countMinus=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                countZero++;
            }
            else if(arr[i]>0){
                countPlus++;
            }
            else{
                countMinus++;
            }
        }
    
        System.out.println((float)(countPlus)/(float)(n));
        System.out.println((float)(countMinus)/(float)(n));
        System.out.println((float)(countZero)/(float)(n));
        sc.close();
    }
}
