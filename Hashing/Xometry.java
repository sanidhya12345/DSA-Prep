package Hashing;

//codechef problem 
import java.util.*;
public class Xometry {
    static int[] map = new int[5000005];
    public static long countRectangles(int [] arr,int n,int target){
        long count=0;
        //store the frequencies of all xor's
        for(int i=2;i<n;i++){
            for(int j=i+1;j<n;j++){
                map[arr[i] ^ arr[j]]++;
            }
        }
        count+=map[arr[0] ^ arr[1]];

        for(int i=2;i<=n-3;i++){
            for(int j=i+1;j<n;j++){
                map[arr[i]^arr[j]]--;
            }
            for(int j=0;j<i;j++){
                count+=map[arr[i]^arr[j]];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                map[arr[i] ^ arr[j]] = 0;
            }
        }
        return count*24;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();//number of testcases
        while (test--!=0) {
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            System.out.println(countRectangles(arr, n,0));
        }
        sc.close();
    }
}
