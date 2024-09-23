package Arrays;
import java.util.*;
public class ReverseNumberSum {
    public static int reverseNumber(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the left range: ");
        int left=sc.nextInt();
        System.out.println("Enter the right range: ");
        int right=sc.nextInt();
        int reverseSum=0;
        for(int i=left;i<=right;i++){
            reverseSum+=reverseNumber(i);
        } 
        System.out.println(reverseSum);
        sc.close();
    }
}
