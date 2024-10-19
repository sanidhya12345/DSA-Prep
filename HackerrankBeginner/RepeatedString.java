package HackerrankBeginner;
public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long count=0;
        for(char ch:s.toCharArray()) if(ch=='a') count++;
        long length=s.length();
        long val=n/length;
        long rem=n%length;
        long ans=count*val;
        //for remaining characters....
        
        for(int i=0;i<rem;i++){
            if(s.charAt(i)=='a') ans++;
        }
        return ans;
     }
}
