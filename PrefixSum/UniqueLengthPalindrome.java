package PrefixSum;

import java.util.*;
public class UniqueLengthPalindrome{
	
	public static int count(String s){
        int n=s.length();

        // to store the prefix count for each character.
        int [][] prefix=new int[n][26];

        int [][] suffix =new int[n][26];
        //precompute the prefix and suffix counts.
        
        for(int i=0;i<n;i++){

            if(i>0){
                for(int j=0;j<26;j++){
                    prefix[i][j]=prefix[i-1][j];
                }
            }
            prefix[i][s.charAt(i)-'a']++;
        }
        for(int i=n-1;i>=0 ;i--){

            if(i<n-1){
                for(int j=0;j<26;j++){
                    suffix[i][j]=suffix[i+1][j];
                }
            }
            suffix[i][s.charAt(i)-'a']++;
        }

        //find the unique palindromes by fixing the middle character.


        Set<String> unique=new HashSet<>();

        for(int i=1;i<n-1;i++){

            char middle=s.charAt(i);

            for(int c=0; c<26;c++){
                char outer=(char)(c+'a');

                // if outer char exits in prefix and suffix.
                if(prefix[i-1][c]>0 && suffix[i+1][c]>0){
                    unique.add(""+outer+middle+outer);
            }

        }
        
      }
        return unique.size();
    }

    public static void main(String [] args){
        String s="aabca";
        System.out.println(count(s));
    }
	
}