package DynamicProgramming;

import java.util.*;
public class GoogleSDE3 {
    //globalMax store the maximum value of whole array.
    private static int globalMax=Integer.MIN_VALUE;
    
    //globalMin store the minimum value of whole array.
    private static int globalMin=Integer.MAX_VALUE;
    
    public static int findPartitions(int [] arr,int n){
        int c=0; //number of partitions
        int max=Integer.MIN_VALUE; //local maximum value
        int parIndex=1; //starting index of each partition.
        for(int i=1;i<=n;i++){
            max=Math.max(max,arr[i]);
            globalMax=max;
            globalMin=Math.min(globalMin,arr[i]);
            if(max==i){
                int parLength=i-parIndex+1; // parLength denotes the number of elements in each partition
                //as it helps to check partition contains more than 2 element or not.
                //single element does not give -1.
                if(parLength>=2){
                    c++;
                }
                parIndex=i+1; //after complete one partition shift the parIndex to the next partition.
            }
        }
        return c;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n+1];
      for(int i=1;i<=n;i++){
          arr[i]=sc.nextInt();
      }
      int par=findPartitions(arr,n); //number of partitions.
      
      //par==1 means we consider the whole array at once.
      if(par==1){
          System.out.println(globalMax-globalMin);
      }
      //par==0 means array is already sorted in non decreasing order.
      else if(par==0){
          System.out.println(0);
      }
      else{
          System.out.println(globalMax-globalMin-par); //normal case
      }
      sc.close();
    }
}
