package Codechef.Diifficulty5001000;
import java.util.*;
public class Mahasena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countLucky=0;
        int countUnlucky=0;

        for(int i:arr){
            if(i%2==0) countLucky++;
            else countUnlucky++;
        }
        if(countLucky>countUnlucky){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
        sc.close();
    }
}
