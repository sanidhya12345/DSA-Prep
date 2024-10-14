package Hashing;

//Atlassian Interview Problem (Advanced Version)
//find the number of ways to divide an array into three equal parts.
import java.util.*;
public class DivideIntoThreeEqualParts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int totalsum=0;
        for(int i:arr) totalsum+=i;
        int count=0;
        if(totalsum%3==0){
            //hashmap is used to store the frequency of prefix sums.
            HashMap<Integer,Integer> map=new HashMap<>();
            int prefixsum=0;
            int y=totalsum/3;
            for(int i=0;i<n-1;i++){
                prefixsum+=arr[i];//sum of first i elements.

                //check if prefix sum is equal to 2*y then find the number of ways to divide the 2*y in equal partitions.

                if(prefixsum==2*y){

                    count+=map.getOrDefault(y, 0); //how many times y is present in 2*y partitions.
                }
                map.put(prefixsum, map.getOrDefault(prefixsum, 0)+1);
            }
        }
        System.out.println(count);
        sc.close();
    }
}
