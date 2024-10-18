package HackerrankBeginner;
import java.util.*;
public class MarsExploration {
    public static int marsExploration(String s) {
        // Write your code here
            int n=s.length()/3;
            String ori="";
            for(int i=0;i<n;i++){
                ori+="SOS";
            }
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=ori.charAt(i)){
                    count++;
                }
            }
            return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(marsExploration(s));
        sc.close();
    }    
}
