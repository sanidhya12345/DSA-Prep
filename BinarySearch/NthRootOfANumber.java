package BinarySearch;
import java.util.*;
public class NthRootOfANumber {

    public static double multiply(double number,int n){
        double ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*number;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        // find the value of a such that a^n=m;

        double low=1;
        double high=m;
        double eps=1e-7;
        while((high-low)>eps){
            double mid=(low+high)/2;
            double ans=multiply(mid, n);
            if(ans>m){
                high=mid;
            }
            else{
                low=mid;
            }
        }
        System.out.println(low);
        sc.close();
    }
}