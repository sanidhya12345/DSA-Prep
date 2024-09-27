package Codechef.Strings;
import java.util.*;
public class DnaStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String ans="";
            for(int i=0;i<n;i+=2){
                String sub=s.substring(i,i+2);
                if(sub.equals("00")){
                    ans+="A";
                }
                else if(sub.equals("01")){
                    ans+="T";
                }
                else if(sub.equals("10")){
                    ans+="C";
                }
                else{
                    ans+="G";
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
