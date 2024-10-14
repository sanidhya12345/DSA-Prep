package Hashing;

import java.util.*;
public class MicrosoftSDE2 {

    public static int optimization1(int [] arr,int n){
        //TC:O(n^3)
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=3;i<n;i++) map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n-1;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    count+=map.getOrDefault(-sum, 0);
                    map.put(arr[k+1],map.get(arr[k+1])-1);
                }
                for(int z=j+2;z<n;z++){
                    map.put(arr[z],map.getOrDefault(arr[z], 0)+1);
                }
            }
        }
        return count;
    }
    public static int bruteforce(int [] arr,int n){
        //Tc: O(n^4)
        //generate all possible quadruplets and check for the condition.
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){

                        if(arr[i]+arr[j]+arr[k]+arr[l]==0){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> u = new HashMap<>();
        long r = 0;

        // Initialize the hashmap for elements in range [4, n]
        for (int i = 4; i <= n; i++) {
            u.put(b[i], u.getOrDefault(b[i], 0) + 1);
        }

        // Nested loops to calculate r
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n - 1; k++) {
                    int d = -(b[i] + b[j] + b[k]);
                    r += u.getOrDefault(d, 0);  // count frequency of d in the range [k+1, n]

                    // Decrement frequency of b[k+1]
                    u.put(b[k + 1], u.get(b[k + 1]) - 1);
                }

                // Restore the counts of b[z] for future iterations
                for (int z = j + 3; z <= n; z++) {
                    u.put(b[z], u.getOrDefault(b[z], 0) + 1);
                }
            }
        }

        System.out.println(r);
        sc.close();
    }
}