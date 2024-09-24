package HackerrankBeginner;

import java.util.Scanner;
import java.util.Arrays;
public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=38){
                int val=((arr[i]/5)+1)*5;
                if(val-arr[i]<3){
                    arr[i]=val;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
