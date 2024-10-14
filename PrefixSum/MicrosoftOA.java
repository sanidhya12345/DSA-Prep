package PrefixSum;
import java.util.*;
public class MicrosoftOA {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        long n = scanner.nextLong();
        long[] a = new long[(int) (n + 1)];
        
        for (long i = 1; i <= n; i++) {
            a[(int) i] = scanner.nextLong();
        }

        long x = scanner.nextLong();
        long y = scanner.nextLong();

        long [] prefix=new long[(int)n+1];
        prefix[0]=a[0];
        for(long i=1;i<=n;i++){
            if(i-y>=1){
                prefix[(int)i]=a[(int)i]+prefix[(int)(i-y)];
            }
            else{
                prefix[(int)i]=a[(int)i];
            }
        }
        long ans=(long)1e18;
        for(long i=1;i<=n;i++){
            long index=i-(x-1)*y;
            if(index>=1){
                long g = prefix[(int) i];
                if (index - y >= 1) {
                    g = g - prefix[(int) (index - y)];
                }
                ans=Math.min(ans, g);
            }
        }
        System.out.println(ans);
        
        scanner.close();
    }
}
