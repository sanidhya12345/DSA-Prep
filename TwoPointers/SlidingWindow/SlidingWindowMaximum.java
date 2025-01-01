package TwoPointers.SlidingWindow;

import java.util.*;
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int [] ans=new int[n-k+1];
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer,Integer> map=new HashMap<>();
        int index=0;
        while(j<n){
            maxHeap.add(nums[j]);
            map.put(nums[j],map.getOrDefault(nums[j], 0)+1);

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){

                //remove the invalid elements

                while(map.get(maxHeap.peek())==null || map.get(maxHeap.peek())==0){
                    maxHeap.poll();
                }

                ans[index]=maxHeap.peek();
                index++;
                map.put(nums[i],map.get(nums[i])-1);
                i++;
                j++;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int [] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}