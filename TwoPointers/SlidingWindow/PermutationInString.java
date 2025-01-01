package TwoPointers.SlidingWindow;

import java.util.*;
public class PermutationInString {

    public static String sortString(String s){
        char [] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static boolean checkInclusion(String s1, String s2) {
        
        int i=0;
        int j=0;
        s1=sortString(s1);
        int n=s2.length();
        int k=s1.length();
        while(j<n){

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                String sub=sortString(s2.substring(i, j+1));
                if(sub.equals(s1)){
                    return true;
                }
                i++;
                j++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }
}
