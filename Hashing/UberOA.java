package Hashing;

import java.util.*;
public class UberOA {
    public static int digitCount(int n){
        return Integer.toString(n).length();
    }
    public static int calcSum(int [] arr){
        int sum=0;
        for(int i:arr) sum+=i;
        return sum;
    }
    public static int optimise(int [] arr,int n){
        //? digit[u]=count of the number which has 'u' digits in it.
        int [] digit=new int[10];
        for(int i=0;i<n;i++){
            int u=digitCount(arr[i]);
            digit[u]=digit[u]+1; //!increment the frequency of number which has 'u' digits.
        }
        int totalsum=calcSum(arr);// whole sum of the array.
        int ans=0;
        for(int i=0;i<n;i++){
            int right=totalsum;
            int l=1;
            int y=0;
            while(l<=6){
                y=y+arr[i]*(int)Math.pow(10,l)*(digit[l]);
                l++;
            }
            int left=y;
            int v=left+right; //! add the combination of numbers.
            ans+=v;
        }
        return ans;
    }
    public static int bruteForce(int [] arr,int n){
        int sum=0;
        //generate all the possible combinations by running two for loops.
        //TC:O(n^2)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                String s1=Integer.toString(arr[i]);
                String s2=Integer.toString(arr[j]);
                s1=s1+s2;
                sum=sum+Integer.parseInt(s1);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        //System.out.println(bruteForce(arr, n));
        System.out.println(optimise(arr, n));
        sc.close();    
    }
}
