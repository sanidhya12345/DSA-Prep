package TwoPointers.SlidingWindow;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-28
 * Time: 10:07
 */

import java.util.*;
public class CountSubstringsAtleastKUniqueChars {

    public static int countSubstr(String s,int k){
        int count=0;
        int n=s.length();
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0)+1);
            j++;
            while(i<=j && map.size()>=k){

                map.put(s.charAt(i), map.get(s.charAt(i))-1);

                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));

                count+=n-j+1;

                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new  Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(countSubstr(s, k));
        sc.close();
    }
}
