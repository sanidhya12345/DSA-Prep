import java.util.*;
public class CountNumberOfTriangles{
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=1;
        int n=arr.length;
        int count=0;
        while(i<n && j<n){
            int sum=arr[i]+arr[j];
            for(int k=j+1;k<n;k++){
               if(sum>arr[k]){
                   count++;
               }
            }
            j++;
            if(j==n){
                i++;
                j=i+1;
            }
        }
        return count;
    }
    public static void main(String [] args){
        int [] arr={4,6,3,7};
        System.out.println(countTriangles(arr));
    }
}
