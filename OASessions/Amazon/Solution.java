package OASessions.Amazon;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-04
 * Time: 14:25
 */

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        if(x==y){
            System.out.println((n/2)*x);
        }
        else if(x<y){
            int c1=0; //count of characters with odd frequency.
            for(char ch:map.keySet()){
                if(map.get(ch)%2!=0){
                    c1++;
                }
            }
            int ans=((c1/2)* y) + ((n-c1)/2) * x;
            System.out.println(ans);
        }
        else{
            PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
            maxHeap.addAll(map.values());
            int c0 = 0; // Count of operations
            while (maxHeap.size() > 1) {
                int freq1 = maxHeap.poll();
                int freq2 = maxHeap.poll();
    
                // Decrement their frequencies and put back if still greater than 0
                if (freq1 - 1 > 0) maxHeap.add(freq1 - 1);
                if (freq2 - 1 > 0) maxHeap.add(freq2 - 1);
    
                c0++; // Increment operation count
            }
            int remCount= maxHeap.isEmpty() ? 0 : maxHeap.poll();
            System.out.println(c0*y+(remCount/2)*x);
        }
        sc.close();
    }
}