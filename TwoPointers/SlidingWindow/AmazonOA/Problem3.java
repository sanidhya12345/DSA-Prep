package TwoPointers.SlidingWindow.AmazonOA;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-28
 * Time: 11:25
 */

import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String search=sc.next();
        String result=sc.next();
        int i=0;
        int j=0;
        int n=search.length();
        int m=result.length();
        while (i<n && j<m) {
             if(search.charAt(i)==result.charAt(j)){
                i++;
                j++;
             }
             else{
                i++;
             }
        }
        int minChar=result.length()-j;
        System.out.println(minChar);
        sc.close();
    }
}
