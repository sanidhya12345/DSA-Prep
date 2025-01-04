package PrefixSum;

public class LongestSubarraySumDivK{
	
	 public static int length(int [] arr,int k){

        HashMap<Integer,Integer> map=new HashMap<>();
        
        int prefix=0;
        int maxlen=-1;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){

            prefix+=arr[i];
            int rem=prefix%k;
            if(rem<0) rem+=k;
            if(map.containsKey(rem)){

                maxlen=Math.max(maxlen,i-map.get(rem));
            }
            else{
                map.put(rem,i);
            }
        }
        return maxlen;
    }

    public static void main(String [] args){
        int [] arr={2,7,6,1,4,5};
        int k=3;
        System.out.println(length(arr,k));
    }

	
}