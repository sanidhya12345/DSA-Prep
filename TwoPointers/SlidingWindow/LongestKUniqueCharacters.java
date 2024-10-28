package TwoPointers.SlidingWindow;


// Author: Sanidhya Varshney
// Date: 2024-10-28 09:32

import java.util.*;

public class LongestKUniqueCharacters {
    public static int longestkSubstr(String s, int k) {
        // code here

        int n=s.length();
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=-1;
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while (map.size()>k) {
                char c=s.charAt(i);
                map.put(c, map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                i++;
            }
            if(map.size()==k){
                maxLen=Math.max(maxLen,j-i+1);
            }
            j++;
        }
        return maxLen;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(longestkSubstr(s, k));
        sc.close();
    }
}