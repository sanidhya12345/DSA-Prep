import java.util.*;
public class MaxVowels{
   public static boolean check(char ch){
       return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
   }
   public static int maxVowels(String s,int k){
        int i=0;
        int j=0;
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int [] prefix=new int[n];
        prefix[0]=check(s.charAt(0))?1:0;

        for(int c=1;c<n;c++){
            if(check(s.charAt(c))){
                prefix[c]=prefix[c-1]+1;
            }
            else{
                prefix[c]=prefix[c-1];
            }
        }

        while(j<n){
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(i==0){
                    max=Math.max(prefix[j]-prefix[0],max);
                }
                else{
                    max=Math.max(prefix[j]-prefix[i-1],max);
                }
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String [] args){
        String s="abciiidef";
        int k=3;
        System.out.println(maxVowels(s,k));
    }
}
