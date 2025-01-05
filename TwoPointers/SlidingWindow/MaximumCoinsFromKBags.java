import java.util.*;
public class MaximumCoinsFromKBags{

    public static long maximumCoins(int[][] A,int k){
        //sort the array with their starting points.

        Arrays.sort(A,(a,b)->a[0]-b[0]);
        int n=A.length;
        long res=0; //maximum number of coins collected
        long cur=0;//current number of coins collected.

        //starting from A[i][0]

        for(int i=0,j=0;i<n;i++){
            while(j<n && A[j][1] <=A[i][0]+k-1){
                cur+=1L *(A[j][1]-A[j][0]+1)*A[j][2];
                j++;
            }
            if(j<n){
                long part=1L *Math.max(0,A[i][0]+k-1-A[j][0]+1)*A[j][2];
                res=Math.max(res,cur+part);
            }
            cur-=1L *(A[i][1]-A[i][0]+1)*A[i][2];
        }

        //ending at A[i][1]
        
        cur=0;
        for(int i=0,j=0;i<n;i++){
            cur+=1L *(A[i][1]-A[i][0]+1)*A[i][2];
            while(A[j][1]<A[i][1]-k+1){
                cur-=1L *(A[j][1]-A[j][0]+1)*A[j][2];
                j++;
            }
            long part =1L * Math.max(0,A[i][1]-k-A[j][0]+1)*A[j][2];
            res=Math.max(res,cur-part);
        }
        return res;
    }
    public static void main(String [] args){
        int [][] arr={{8,10,1},{1,3,2},{5,6,4}};
        int k=4;
        System.out.println(maximumCoins(arr,k));
    }

}
