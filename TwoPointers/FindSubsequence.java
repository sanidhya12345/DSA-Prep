package TwoPointers;

import java.util.*;
public class FindSubsequence {
    private static int p=-1;
    public static boolean isSubsequence(String a,String b){
        int n=a.length();
        int m=b.length();
        int i=0,j=0,count=0;
        while (i<m && j<n) {
            if(a.charAt(j)==b.charAt(i)){
                if(count==0){
                    p=j;
                }
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        return count==m;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        for (int test = 0; test < t; test++) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            int answer = -1;

            for (int i = 1; i < b.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    StringBuilder r = new StringBuilder(b);
                    r.setCharAt(i, c);
                    p = -1;
                    if (isSubsequence(a, r.toString())) {
                        answer = p + 1;
                    }
                }
            }
            System.out.println(answer);
        }
        scanner.close();
    }
}